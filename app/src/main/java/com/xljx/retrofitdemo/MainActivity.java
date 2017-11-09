package com.xljx.retrofitdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.vito.encrypt.MD5;

import java.io.IOException;
import java.util.List;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    private List<String> cookieList;
    private TextView mTextView;
    private TextView mCookieTextView;
    private TextView mUploadView;
    private TextView mDownloadView;
    private Retrofit retrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRequest();
        findViews();
        addListener();
    }

    private void findViews() {
        mTextView = findViewById(R.id.tv_login);
        mCookieTextView = findViewById(R.id.tv_cookie);
        mUploadView = findViewById(R.id.tv_upload);
        mDownloadView = findViewById(R.id.tv_download);
    }

    private void initRequest() {
        // Retrofit使用OkHttp保存和添加cookie
        // http://www.jianshu.com/p/1caa92bf8079
        Interceptor interceptor = new Interceptor() {
            @Override
            public okhttp3.Response intercept(Chain chain) throws IOException {
                Request request = chain.request();
                Request.Builder builder = request.newBuilder();
                if (cookieList != null && !cookieList.isEmpty()) {
                    for (String cookie : cookieList)
                        builder.addHeader("Cookie", cookie);
                }
                okhttp3.Response response = chain.proceed(builder.build());
                // 保存 变更的cookie
                cookieList = response.headers().values("Set-Cookie");
                return response;
            }
        };
        OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(interceptor).build();
        retrofit = new Retrofit.Builder().baseUrl("http://cloudoa.bkvito.com/").client(okHttpClient)
                // 按照retrofit的逻辑，是从前往后进行匹配，如果匹配上，就忽略后面的，直接使用。
                .addConverterFactory(MoshiConverterFactory.create()).build();
    }

    private interface TimeStampService {
        @GET("base/authoriza/login/getTimestamp.htm")
        Call<ResponseBody> get();
    }

    private interface LoginService {
        @FormUrlEncoded
        @POST("base/authoriza/login/userLoginPhone.htm")
        Call<ResponseBody> login(@Field("userCode") String username, @Field("password") String password);
    }

    private void addListener() {
        mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Call<ResponseBody> result = retrofit.create(TimeStampService.class).get();
                result.enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, final Response<ResponseBody> response) {
                        String json = response.body().toString();

                        LoginService loginService = retrofit.create(LoginService.class);
                        String send_pwd = MD5.getMD5("123456" + mTimeStamp);
                        Call<ResponseBody> loginCall = loginService.login("nn001", send_pwd);
                        loginCall.enqueue(new Callback<ResponseBody>() {
                            @Override
                            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                                Log.i(TAG, response.body().toString());
                            }

                            @Override
                            public void onFailure(Call<ResponseBody> call, Throwable t) {

                            }
                        });
                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {

                    }
                });
//                if(result.isExecuted()){
//                    result.cancel();
//                }
            }
        });
    }
}
