package com.xljx.retrofitdemo;

import android.support.annotation.NonNull;
import android.text.TextUtils;

import java.util.HashMap;

/**
 * Created by pc on 2016/11/22.
 */
// todo: host地址重新设置后，需要重置所有关联地址
public class Comments {

    // 主机地址（不对外直接暴露）
    private static String BASE_URL = "http://123.138.87.158:55500/";
    /*
    * local configs
    */
    public static final String FG_HOME_DATA = "/json/vito_home_tab_data.json";
    public static final String HOME_MORE_FUN_CONFIG = "/json/vito_all_actions.json";
    public static final String MY_INFO_PATH = "/json/vito_my_info.json";

    /*SMS*/
    public static String SMS_URL = BASE_URL + "oa/base/sendVerificationCode.htm";
    public static String SMS_RESETPWD = BASE_URL + "base/authoriza/user/sendSms.htm";

    /* Login */
    public static String LOGIN_URL = BASE_URL + "base/authoriza/login/userLoginPhone.htm";
    public static String GET_TIME_STAMP_URL = BASE_URL + "base/authoriza/login/getTimestamp.htm";
    public static String YTX_LOGIN_SUCCESS = BASE_URL + "base/msg/ytx/ytxLoginSuc.htm";
    /*register*/
    public static String CHECK_TELNEMBUER_URL = BASE_URL + "oa/base/authoriza/user/queryUserCount.htm";
    public static String REGISTER_SECOND_URL = BASE_URL + "oa/base/saveRegisterUserByDeptCodeSecond.htm";
    public static String REGISTER_FIRST_URL = BASE_URL + "oa/base/saveRegisterUserByDeptCode.htm";
    public static String REGISTER_DEPT_URL = BASE_URL + "oa/base/saveRegisterUser.htm";

    public static String RESETPWD_URL = BASE_URL + "base/authoriza/user/updPwdByMobile.htm";
    /* CloudDisk */
    public static String DIR_FROM_CLOUD_URL = BASE_URL + "fs/file/list.htm";
    public static String DOWNLOAD_FILE_URL = BASE_URL + "fs/file/download.htm";
    public static String SPACE_SIZE_URL = BASE_URL + "fs/space/size.htm";
    public static String PERSONAL_FOLDER_CREATE_URL = BASE_URL + "fs/user/folder/create.htm";
    public static String GROUP_FOLDER_CREATE_URL = BASE_URL + "fs/org/folder/create.htm";
    public static String UPDATE_RENAME_URL = BASE_URL + "fs/file/update.htm";
    public static String FILE_DELETE_URL = BASE_URL + "fs/file/delete.htm";
    public static String QUERY_GROUP_BY_USER_URL = BASE_URL + "oa/fsgroup/queryFSGroupByUser.htm";
    public static String UPLOAD_FILE_URL = BASE_URL + "fs/user/file/upload.htm";
    public static String GROUP_UPLOAD_FILE_URL = BASE_URL + "fs/org/file/upload.htm";
    public static String GET_DEFAULT_SPACE_URL = BASE_URL + "fs/default/space/get.htm";
    public static String CHANGE_DEFAULT_SPACE_SIZE_URL = BASE_URL + "fs/default/space/update.htm";
    public static String SEARCH_FILE_URL = BASE_URL + "fs/file/list.htm";
    public static String USED_SPACE_SIZE = BASE_URL + "fs/usage/list.htm";
    public static String CHANGE_INFO_URL = BASE_URL + "fs/file/change/list.htm";
    public static String FILE_PREVIEW_URL = BASE_URL + "fs/file/preViewForMobile.htm";
    public static String FILE_PREVIEW_OTHER_URL = BASE_URL + "fs/file/preViewOther.htm";

    /* calendar and conference */
    //-------------------------公共接口--------------
    //获取台历/会议的事件列表  1
    public static String CALENDAR_EVENT_URL = BASE_URL + "off/event/list.htm";
    //查询台历/会议室列表（基础） 4
    public static String EVENT_LIST_URL = BASE_URL + "off/event/base/list.htm";
    // 新增会议/事件
    public static String ADD_EVENT_URL = BASE_URL + "off/event/add.htm";
    // 已关注会议事件列表  3
    public static String CALENDAR_EVENT_FOCUS_URL = BASE_URL + "off/event/focus/list.htm";
    // 新增台历事件/会议室   6
    public static String ADD_CALENDAR_URL = BASE_URL + "off/event/base/add.htm";
    // 删除会议/事件  5
    public static String DELETE_EVENT_URL = BASE_URL + "off/event/delete.htm";
    // 删除台历/会议室 7
    public static String DELETE_CALENDAR_URL = BASE_URL + "off/event/base/delete.htm";
    // 关注/取消关注会议事件
    public static String FOCUS_EVENT_UPDATE_URL = BASE_URL + "off/event/focus/update.htm";
    // 获取台历（会议室）的用户列表 9
    public static String USER_LIST_URL = BASE_URL + "off/event/base/user/list.htm";
    // 获取事件（会议）的用户列表  10
    public static String EVENT_USER_LIST_URL = BASE_URL + "off/event/user/list.htm";
    //-----------------------------
    public static String CALENDAR_CREAT_URL = BASE_URL + "off/event/queryEventByUserId.htm";
    // 更新台历-会议室 的基本信息 11
    public static String BASE_EVENT_UPDATE_URL = BASE_URL + "off/event/base/update.htm";
    // 更新会议-事件 的详细信息 12
    public static String EVENT_UPDATE_URL = BASE_URL + "off/event/update.htm";
    // 获取会议-事件 的详细信息 13
    public static String GET_EVENT_INFO_URL = BASE_URL + "off/event/get.htm";

    /* 打卡签到 */
    public static String SIGN_ON_REQUEST_URL = BASE_URL + "oa/att/checkIn.htm";
    public static String SIGN_ON_HISTORY_URL = BASE_URL + "oa/att/user/attendance/log.htm";
    public static String SIGN_ON_USER_INFO_URL = BASE_URL + "oa/att/user/attendance.htm";
    public static String SIGN_ON_REQUEST_NEW_URL = BASE_URL + "oa/att/checkInNew.htm";

    /* 考勤管理 */
    // 查询考勤管理界面tab信息(团队)
    public static String ATTENDANCE_PAGE_TAB = BASE_URL + "att/attGroupSetting/getAttTabList.htm";
    // 团队考勤
    public static String ATTENDANCE_GROUP = "quarter/attendanceStatistics/administratorsSta.HTML";
    // 个人考勤（无权限）
    public static String ATTENDANCE_PERSONAL = "quarter/attendanceStatistics/personalStatistics.HTML";

    public static String ATTENDANCE_PERM = "/view/quarter/attendanceStatistics/attendCompanyList";
    /* fun list */
//    public static final String NAVIGATION_URL = BASE_URL + "ecs/common/module/getModule.htm";
    public static String NAVIGATION_URL = /*BASE_URL +*/ "/json/vito_moudles_test.json";

    /* email */
    /* public */
    public static String PUBLIC_URL = BASE_URL + "oa/email/invoke.htm";
    public static String CHECK_EMAIL_EXIST_URL = BASE_URL + "oa/email/checkUserMailExist.htm";
    public static String CHECK_EMAIL_REPEAT_URL = BASE_URL + "oa/email/checkUserMailRepeat.htm";
    public static String CHECK_EMAIL_SAVE_URL = BASE_URL + "oa/email/saveUserMail.htm";

    public static String GET_EMAIL_INBOX_URL = BASE_URL + "oa/email/getInboxEmail.htm";
    public static String GET_EMAIL_SENDBOX_URL = BASE_URL + "oa/email/getSentEmail.htm";
    public static String GET_EMAIL_DRAFTBOX_URL = BASE_URL + "oa/email/getDraftEmail.htm";
    public static String GET_EMAIL_DETAIL_URL = BASE_URL + "oa/email/getViewEmail.htm";
    public static String DELETE_EMAIL_URL = BASE_URL + "oa/email/deleteEmail.htm";
    public static String DELETE_EMAIL_BATCH_URL = BASE_URL + "oa/email/delBatchEmail.htm";
    public static String GET_EMAILSIGN_URL = BASE_URL + "oa/email/getEmailSign.htm";
    public static final String SAVE_EMAIDRAFT_METHOD_NAME = "saveDraftEmail";
    public static final String REPLY_EMAIl_METHOD_NAME = "replyEmail";
    public static final String REPEAT_EMAIl_METHOD_NAME = "forwardEmail";
    public static final String SEND_DRAFT_METHOD_NAME = "draftSendEmail";
    public static final String RESAVE_DRAFT_METHOD_NAME = "saveDraftAgainEmail";
    public static final String SAVE_REPLY_FORWARD_DRAFT_METHOD_NAME = "saveReplyForwardDraftEmail";
    public static final String SEND_EMAIL_METHOD_NAME = "sendEmail";

    public static String UPLOAD_EMAI_URL = BASE_URL + "oa/email/uploadAttachment.htm";

    public static String EMAIL_INNER_TREE = BASE_URL + "oa/emailContacts/getInnerContactsTree.htm";
    public static String EMAIL_EXTERNAL_TREE = BASE_URL + "oa/emailContacts/getEmailContactsTree.htm";
    public static String EMAIL_DOWNLOAD_URL = BASE_URL + "oa/email/downloadFile.htm";
    public static String MEETING_PERSON_URL = BASE_URL + "oa/attGroup/queryUserTree.htm";

    /*personal info*/
    public static String PERSONAL_INFO_CHANGE = BASE_URL + "base/authoriza/user/update.htm";
    public static String PERSONAL_PWD_CHANGE = BASE_URL + "base/authoriza/user/updPsd.htm";
    public static String UPLOAD_IMG_URL = BASE_URL + "base/authoriza/fileup/uploadFile.htm";

    /* upload */
    public static String UPLOAD_IMG_PATH = BASE_URL + "base/authoriza/fileup/upload.htm";

    /* notice*/
    public static String QUERY_NOTICE_PATH = BASE_URL + "oa/notice/queryReceiveNotice.htm";
    public static String READ_NOTICE_PATH = BASE_URL + "oa/notice/readNotice.htm";
    public static String NOTICECOUNT_PATH = BASE_URL + "oa/notice/queryReceiveNoticeCount.htm";

    public static String APPROVAL_MEETING_PATH = BASE_URL + "off/event/meetingUserList.htm";
    public static String APPROVAL_OPERATION_PATH = BASE_URL + "off/event/update/meetingStatus.htm";

    /* daily */
    public static String DAILY_REPORT = BASE_URL + "oa/daily/mobile/report.HTML";

    /**
     * 登录的userId
     */
    public static final String USERID = "loginid";
    /**
     * 用户注册手机号
     */
    public static final String TELNUMBER = "telnumber";
    /**
     * 登录密码
     */
    public static final String PASSWORD = "password";

    /**
     * 是否自动登录
     */
    public static final String AUTOLOGIN = "isAutoLogin";

    /**
     * 是否记住密码
     */
    public static final String REMEMBERPASSWORD = "isRememberPassword";

    public static final String HOST_STR = "host_addr";

    /**
     * 友盟推送相关
     */
    public static String UPDATE_DEVICE_TOKEN = BASE_URL + "base/msg/mq/updUserDeviceInfo.htm";
    public static final String UMENG_APP_NAME = "swybg";
    /**
     * 联系人相关
     */
    public static final String CONTACT_BASE_DATA = "/json/vito_contact_base_data.json";
    public static String CONTACT_DATA = BASE_URL + "oa/oauser/queryUser.htm";
    public static String CONTACT_AND_DEPT_DATA = BASE_URL + "oa/oadept/queryDeptUser.htm";
    public static String CONTACT_DETAIL = BASE_URL + "oa/oauser/queryUser.htm";
    public static String CONTACT_JOB_INFO = BASE_URL + "oa/oarole/queryOARole.htm"; // delete
    public static String CONTACT_DEPARTMENT = BASE_URL + "base/authoriza/dept/getTreeall.htm";
    public static String GROUP_USER = BASE_URL + "oa/fsgroup/getGroupDetail.htm";
    public static String DISBAND_GROUP = BASE_URL + "oa/fsgroup/deleteFSGroup.htm";
    public static String QUIT_GROUP = BASE_URL + "oa/fsgroup/deleteGroupUser.htm";
    public static String UPDATE_GROUP_INFO = BASE_URL + "oa/fsgroup/updateFSGroup.htm";
    /**
     * 群组
     */
    public static String GROUP_ALL = BASE_URL + "oa/fsgroup/getAllGroupList.htm";
    public static String SAVE_GROUP = BASE_URL + "oa/fsgroup/saveFSGroup.htm";
    public static String GROUP_RELATION = BASE_URL + "oa/fsgroup/queryUserGroupIds.htm";
    /**
     * 分页数据 单页容量
     */
    public static final int PAGE_SIZE = 10;
    public static final HashMap<String, String> sParticularContacts = new HashMap<String, String>() {{
        put(ParticularMessages.SENDER_APPROVAL, "审批");
        put(ParticularMessages.SENDER_NOTICE, "公告");
        put(ParticularMessages.SENDER_MEETING, "会议");
        put(ParticularMessages.SENDER_EMAIL, "邮件");
        put(ParticularMessages.SENDER_CALENDAR, "日历");
        put(ParticularMessages.SENDER_ATTENDANCE, "考勤");
        put(ParticularMessages.SENDER_DOCUMENT, "公文");
        put(ParticularMessages.SENDER_CLOUD, "云盘");
    }};
    /*
    * badgeview type
    */
    public static String mBadgeTypes[] = {"system", "community"};
    public static String[] EMAIL_REPLY_OPER_NAMES = {
            "回复", "全部回复", "转发"
    };
    public static String EMAIL_REPLY_OPERS_NEW = "new";
    public static String EMAIL_REPLY_OPERS_REPLY = "reply";
    public static String EMAIL_REPLY_OPERS_REPLYALL = "replyall";
    public static String EMAIL_REPLY_OPERS_REPEAT = "repeat";
    public static String[] EMAIL_REPLY_OPERS = {
            EMAIL_REPLY_OPERS_REPLY, EMAIL_REPLY_OPERS_REPLYALL, EMAIL_REPLY_OPERS_REPEAT
    };
    public static String[] EMAIL_DEL_OPER_NAMES = {
            "删除", "彻底"
    };
    public static String EMAIL_DEL_OPERS_DEL = "delete";
    public static String EMAIL_DEL_OPERS_DELALL = "deleteall";
    public static String[] EMAIL_DEL_OPERS = {
            EMAIL_DEL_OPERS_DEL, EMAIL_DEL_OPERS_DELALL
    };
    public static String EMAIL_DOWNLOAD_DIR = "vito_email";
    public static String IMAGE_START = "/download";

    public class ParticularMessages {
        //审批
        public static final String SENDER_APPROVAL = "10000";
        //公告
        public static final String SENDER_NOTICE = "10001";
        //会议
        public static final String SENDER_MEETING = "10002";
        //邮件
        public static final String SENDER_EMAIL = "10003";
        //日历
        public static final String SENDER_CALENDAR = "10004";
        //考勤
        public static final String SENDER_ATTENDANCE = "10005";
        //公文
        public static final String SENDER_DOCUMENT = "10006";
        //云盘
        public static final String SENDER_CLOUD = "10007";
    }

    // 日志
    //日志模版
    public static String DAILY_RECORD_TEMPLATE = BASE_URL + "daily/form/queryAllForm.htm";
    // 添加日志
    public static String DAILY_RECORD_ADD = BASE_URL + "daily/add.htm";

    // 我发出的

    // 我收到的

    // 日志报表

    // 获取部门档案列表
    public static String ARCHIVES_DEPARTMENT_URL = BASE_URL + "archive/user/list.htm";
    // 获取个人档案
    public static String ARCHIVES_PERSONAL_URL = BASE_URL + "archive/user.htm";
    // 修改档案
    public static String ARCHIVES_MODIFY = BASE_URL + "archive/user/modify.htm";
    // 获取用户调岗记录
    public static String ARCHIVES_POSITION_ADJ = BASE_URL + "archive/user/station/list.htm";

    //薪酬(时间段)
    public static String SALERY_URL = BASE_URL + "salary/user/list.htm";
    // 薪酬项
    public static String SALARY_ITEM_LIST = BASE_URL + "salary/base/list.htm"/* + "?loadAll=true"*/;

    // 共同查询权限接口
    public static String COMMON_PERMISSION_URL = BASE_URL + "base/authoriza/func/filter.htm";

    //日志报表权限
    public static String DAILY_RECORD_TABLE_PERMISION = "/view/oa/daily/my/dailyList";

    // 当前用户能否创建会议或者事件的权限
    public static String CALENDR_ADD_PERMISSION = "/view/oa/meetting/newEvent/newEvent";

    // 部门档案权限
    public static String ARCHIVES_DEPT_PERMISSION = "/view/oa/archive/setting/index";

    /**
     * 重置主机地址
     *
     * @param host
     */
    public static void resetUrl(@NonNull String host) {
        if (TextUtils.isEmpty(host)) {
            return;
        }

        BASE_URL = host;

        /*SMS*/
        SMS_URL = BASE_URL + "oa/base/sendVerificationCode.htm";
        SMS_RESETPWD = BASE_URL + "base/authoriza/user/sendSms.htm";

    /* Login */
        LOGIN_URL = BASE_URL + "base/authoriza/login/userLoginPhone.htm";
        GET_TIME_STAMP_URL = BASE_URL + "base/authoriza/login/getTimestamp.htm";
        YTX_LOGIN_SUCCESS = BASE_URL + "base/msg/ytx/ytxLoginSuc.htm";
    /*register*/
        CHECK_TELNEMBUER_URL = BASE_URL + "oa/base/authoriza/user/queryUserCount.htm";
        REGISTER_SECOND_URL = BASE_URL + "oa/base/saveRegisterUserByDeptCodeSecond.htm";
        REGISTER_FIRST_URL = BASE_URL + "oa/base/saveRegisterUserByDeptCode.htm";
        REGISTER_DEPT_URL = BASE_URL + "oa/base/saveRegisterUser.htm";

        RESETPWD_URL = BASE_URL + "base/authoriza/user/updPwdByMobile.htm";
    /* CloudDisk */
        DIR_FROM_CLOUD_URL = BASE_URL + "fs/file/list.htm";
        DOWNLOAD_FILE_URL = BASE_URL + "fs/file/download.htm";
        SPACE_SIZE_URL = BASE_URL + "fs/space/size.htm";
        PERSONAL_FOLDER_CREATE_URL = BASE_URL + "fs/user/folder/create.htm";
        GROUP_FOLDER_CREATE_URL = BASE_URL + "fs/org/folder/create.htm";
        UPDATE_RENAME_URL = BASE_URL + "fs/file/update.htm";
        FILE_DELETE_URL = BASE_URL + "fs/file/delete.htm";
        QUERY_GROUP_BY_USER_URL = BASE_URL + "oa/fsgroup/queryFSGroupByUser.htm";
        UPLOAD_FILE_URL = BASE_URL + "fs/user/file/upload.htm";
        GROUP_UPLOAD_FILE_URL = BASE_URL + "fs/org/file/upload.htm";
        GET_DEFAULT_SPACE_URL = BASE_URL + "fs/default/space/get.htm";
        CHANGE_DEFAULT_SPACE_SIZE_URL = BASE_URL + "fs/default/space/update.htm";
        SEARCH_FILE_URL = BASE_URL + "fs/file/list.htm";
        USED_SPACE_SIZE = BASE_URL + "fs/usage/list.htm";
        CHANGE_INFO_URL = BASE_URL + "fs/file/change/list.htm";

        FILE_PREVIEW_URL = BASE_URL + "fs/file/preViewForMobile.htm";
        FILE_PREVIEW_OTHER_URL = BASE_URL + "fs/file/preViewOther.htm";

    /* calendar and conference */
        CALENDAR_EVENT_URL = BASE_URL + "off/event/list.htm";
        EVENT_LIST_URL = BASE_URL + "off/event/base/list.htm";
        ADD_EVENT_URL = BASE_URL + "off/event/add.htm";
        CALENDAR_EVENT_FOCUS_URL = BASE_URL + "off/event/focus/list.htm";
        ADD_CALENDAR_URL = BASE_URL + "off/event/base/add.htm";
        DELETE_EVENT_URL = BASE_URL + "off/event/delete.htm";
        DELETE_CALENDAR_URL = BASE_URL + "off/event/base/delete.htm";
        FOCUS_EVENT_UPDATE_URL = BASE_URL + "off/event/focus/update.htm";
        USER_LIST_URL = BASE_URL + "off/event/base/user/list.htm";
        EVENT_USER_LIST_URL = BASE_URL + "off/event/user/list.htm";
        CALENDAR_CREAT_URL = BASE_URL + "off/event/queryEventByUserId.htm";
        BASE_EVENT_UPDATE_URL = BASE_URL + "off/event/base/update.htm";
        EVENT_UPDATE_URL = BASE_URL + "off/event/update.htm";
        GET_EVENT_INFO_URL = BASE_URL + "off/event/get.htm";

    /* sign_on */
        SIGN_ON_REQUEST_URL = BASE_URL + "oa/att/checkIn.htm";
        SIGN_ON_HISTORY_URL = BASE_URL + "oa/att/user/attendance/log.htm";
        SIGN_ON_USER_INFO_URL = BASE_URL + "oa/att/user/attendance.htm";
        SIGN_ON_REQUEST_NEW_URL = BASE_URL + "oa/att/checkInNew.htm";

    /* attendance */
        ATTENDANCE_PAGE_TAB = BASE_URL + "att/attGroupSetting/getAttTabList.htm";

    /* fun list */
//    public static final String NAVIGATION_URL = BASE_URL + "ecs/common/module/getModule.htm";

    /* public */
        PUBLIC_URL = BASE_URL + "oa/email/invoke.htm";

    /* email */
        CHECK_EMAIL_EXIST_URL = BASE_URL + "oa/email/checkUserMailExist.htm";
        CHECK_EMAIL_REPEAT_URL = BASE_URL + "oa/email/checkUserMailRepeat.htm";
        CHECK_EMAIL_SAVE_URL = BASE_URL + "oa/email/saveUserMail.htm";

        GET_EMAIL_INBOX_URL = BASE_URL + "oa/email/getInboxEmail.htm";
        GET_EMAIL_SENDBOX_URL = BASE_URL + "oa/email/getSentEmail.htm";
        GET_EMAIL_DRAFTBOX_URL = BASE_URL + "oa/email/getDraftEmail.htm";
        GET_EMAIL_DETAIL_URL = BASE_URL + "oa/email/getViewEmail.htm";
        DELETE_EMAIL_URL = BASE_URL + "oa/email/deleteEmail.htm";
        DELETE_EMAIL_BATCH_URL = BASE_URL + "oa/email/delBatchEmail.htm";
        GET_EMAILSIGN_URL = BASE_URL + "oa/email/getEmailSign.htm";

        UPLOAD_EMAI_URL = BASE_URL + "oa/email/uploadAttachment.htm";

        EMAIL_INNER_TREE = BASE_URL + "oa/emailContacts/getInnerContactsTree.htm";
        EMAIL_EXTERNAL_TREE = BASE_URL + "oa/emailContacts/getEmailContactsTree.htm";
        EMAIL_DOWNLOAD_URL = BASE_URL + "oa/email/downloadFile.htm";
        MEETING_PERSON_URL = BASE_URL + "oa/attGroup/queryUserTree.htm";

    /*personal info*/
        PERSONAL_INFO_CHANGE = BASE_URL + "base/authoriza/user/update.htm";
        PERSONAL_PWD_CHANGE = BASE_URL + "base/authoriza/user/updPsd.htm";
        UPLOAD_IMG_URL = BASE_URL + "base/authoriza/fileup/uploadFile.htm";

    /* upload */
        UPLOAD_IMG_PATH = BASE_URL + "base/authoriza/fileup/upload.htm";

    /* notice*/
        QUERY_NOTICE_PATH = BASE_URL + "oa/notice/queryReceiveNotice.htm";
        READ_NOTICE_PATH = BASE_URL + "oa/notice/readNotice.htm";
        NOTICECOUNT_PATH = BASE_URL + "oa/notice/queryReceiveNoticeCount.htm";

        APPROVAL_MEETING_PATH = BASE_URL + "off/event/meetingUserList.htm";
        APPROVAL_OPERATION_PATH = BASE_URL + "off/event/update/meetingStatus.htm";

    /* daily */
        DAILY_REPORT = BASE_URL + "oa/daily/mobile/report.HTML";

        // 友盟推送相关
        UPDATE_DEVICE_TOKEN = BASE_URL + "base/msg/mq/updUserDeviceInfo.htm";// 未使用
        // 联系人相关
        CONTACT_DATA = BASE_URL + "oa/oauser/queryUser.htm";
        CONTACT_AND_DEPT_DATA = BASE_URL + "oa/oadept/queryDeptUser.htm";
        CONTACT_DETAIL = BASE_URL + "oa/oauser/queryUser.htm";
        CONTACT_JOB_INFO = BASE_URL + "oa/oarole/queryOARole.htm"; // delete
        CONTACT_DEPARTMENT = BASE_URL + "base/authoriza/dept/getTreeall.htm";
        GROUP_USER = BASE_URL + "oa/fsgroup/getGroupDetail.htm";
        DISBAND_GROUP = BASE_URL + "oa/fsgroup/deleteFSGroup.htm";
        QUIT_GROUP = BASE_URL + "oa/fsgroup/deleteGroupUser.htm";
        UPDATE_GROUP_INFO = BASE_URL + "oa/fsgroup/updateFSGroup.htm";
        // 群组
        GROUP_ALL = BASE_URL + "oa/fsgroup/getAllGroupList.htm";
        SAVE_GROUP = BASE_URL + "oa/fsgroup/saveFSGroup.htm";
        GROUP_RELATION = BASE_URL + "oa/fsgroup/queryUserGroupIds.htm";

        // 日志
        DAILY_RECORD_TEMPLATE = BASE_URL + "daily/form/queryAllForm.htm";
        DAILY_RECORD_ADD = BASE_URL + "daily/add.htm";

        // 档案
        ARCHIVES_DEPARTMENT_URL = BASE_URL + "archive/user/list.htm";
        ARCHIVES_PERSONAL_URL = BASE_URL + "archive/user.htm";
        ARCHIVES_MODIFY = BASE_URL + "archive/user/modify.htm";
        ARCHIVES_POSITION_ADJ = BASE_URL + "archive/user/station/list.htm";

        //薪酬
        SALERY_URL = BASE_URL + "salary/user/list.htm";
        SALARY_ITEM_LIST = BASE_URL + "salary/base/list.htm"/* + "?loadAll=true"*/;
        COMMON_PERMISSION_URL = BASE_URL + "base/authoriza/func/filter.htm";
    }

    public static String getHost() {
        return BASE_URL;
    }

    public static String updateHost() {
        return getHost();
    }
}
