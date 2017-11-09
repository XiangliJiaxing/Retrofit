package com.xljx.retrofitdemo.data;

/**
 * Created by vito-xa49 on 2017/11/9.
 */

public class LoginResult {
    private String name;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "LoginResult{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
