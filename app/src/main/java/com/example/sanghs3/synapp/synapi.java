package com.example.sanghs3.synapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by sanghs3 on 20/12/17.
 */

public interface synapi {

    String baseURL = "http://words.bighugelabs.com/api/2/8459cca911e7321e158a5e4ee859b582/";

    @GET("{word}/json")
    Call<scemat> getAnswers(@Path("word") String word);




}
