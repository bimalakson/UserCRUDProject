package com.b.usercrudproject.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetUser {
    @SerializedName("Data")
    List<User> data;
    @SerializedName("Total")
    String total;

    public void setData(List<User> data) {
        this.data = data;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public List<User> getData() {
        return data;
    }

    public String getTotal() {
        return total;
    }
}
