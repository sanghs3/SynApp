package com.example.sanghs3.synapp;

/**
 * Created by sanghs3 on 21/12/17.
 */



import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Verb {

    @SerializedName("syn")
    @Expose
    private List<String> syn = null;
    @SerializedName("rel")
    @Expose
    private List<String> rel = null;

    public List<String> getSyn() {
        return syn;
    }

    public void setSyn(List<String> syn) {
        this.syn = syn;
    }

    public List<String> getRel() {
        return rel;
    }

    public void setRel(List<String> rel) {
        this.rel = rel;
    }

}