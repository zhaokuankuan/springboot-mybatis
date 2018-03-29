package com.kk.springbootmybatis.parm;

import com.kk.springbootmybatis.common.UserSexEnum;

/**
 * @author Mr.kk
 */
public class UserParm extends PageParm {

    private String userName;

    private UserSexEnum userEnum;

    public void setUserEnum(UserSexEnum userEnum) {
        this.userEnum = userEnum;
    }

    public UserSexEnum getUserEnum() {
        return userEnum;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

}
