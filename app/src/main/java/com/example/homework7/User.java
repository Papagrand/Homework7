package com.example.homework7;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;


public class User implements Parcelable {
    private String name;
    private String company;
    private int age;
    private byte adult;

    public User(String name, String company, int age, byte adult) {
        this.name = name;
        this.company = company;
        this.age = age;
        this.adult = adult;
    }
    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel parcel) {
            String name = parcel.readString();
            String company = parcel.readString();
            int age = parcel.readInt();
            byte adult = parcel.readByte();
            return new User(name, company, age, adult);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public byte getAdult() {
        return adult;
    }

    public void setAdult(byte adult) {
        this.adult = adult;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(company);
        parcel.writeInt(age);
        parcel.writeByte(adult);
    }
}
