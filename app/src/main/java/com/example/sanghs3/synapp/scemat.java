package com.example.sanghs3.synapp;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class scemat {

    @SerializedName("noun")
    @Expose
    private Noun noun;
    @SerializedName("verb")
    @Expose
    private Verb verb;

    public Noun getNoun() {
        return noun;
    }

    public void setNoun(Noun noun) {
        this.noun = noun;
    }

    public Verb getVerb() {
        return verb;
    }

    public void setVerb(Verb verb) {
        this.verb = verb;
    }

}

