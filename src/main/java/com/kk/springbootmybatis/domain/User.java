package com.kk.springbootmybatis.domain;


import com.kk.springbootmybatis.common.UserSexEnum;

/**
 * @author Mr.kk
 */
public class User {

    private Long id;

    private String userName;

    private String passWord;

    private UserSexEnum userEnum;

    private String nickName;


    public User() {
    }

    public User(Long id, String userName, String passWord, UserSexEnum userEnum, String nickName) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.userEnum = userEnum;
        this.nickName = nickName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setUserEnum(UserSexEnum userEnum) {
        this.userEnum = userEnum;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public UserSexEnum getUserEnum() {
        return userEnum;
    }

    public String getNickName() {
        return nickName;
    }

}
