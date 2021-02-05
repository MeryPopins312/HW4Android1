package com.example.hw4android1;

import android.os.Parcel;
import android.os.Parcelable;

public class SaveInfo implements Parcelable {
    private String name;

    public SaveInfo(String name) {
        this.name = name;
    }




    public String getName() {
        return name;
    }

    public static Creator<SaveInfo> getCREATOR() {
        return CREATOR;
    }



    protected SaveInfo(Parcel in) {
        name=in.readString();
    }

    public static final Creator<SaveInfo> CREATOR = new Creator<SaveInfo>() {
        @Override
        public SaveInfo createFromParcel(Parcel in) {
            return new SaveInfo(in);
        }

        @Override
        public SaveInfo[] newArray(int size) {
            return new SaveInfo[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
    }
}
