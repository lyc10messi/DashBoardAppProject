package com.lenovo.androidlearningproject;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by liuyc17 on 2018/3/28.
 */

public class User implements Parcelable {

    private String name;
    private int age;

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int i) {
        dest.writeString(getName());
        dest.writeInt(getAge());
    }

    public static final Creator<User> CREATOR = new Creator<User>(){
        @Override
        public User createFromParcel(Parcel source){
            return new User(source.readString(), source.readInt());
        }

        @Override
        public User[] newArray(int i) {
            return new User[i];
        }
    };
}
