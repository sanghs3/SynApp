package com.example.sanghs3.synapp;

/**
 * Created by sanghs3 on 21/12/17.
 */

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Noun {

    @SerializedName("syn")
    @Expose
    private List<String> syn = null;

    public List<String> getSyn() {
        return syn;
    }

    public void setSyn(List<String> syn) {
        this.syn = syn;
    }

}