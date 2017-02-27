package com.madchen.mvpdemo.model;

/**
 * Created by chenwei on 2017/2/12.
 */

public interface IUser {

    String getName();

    String getPassWd();

    int checkUserValidity(String name, String passWd);
}
