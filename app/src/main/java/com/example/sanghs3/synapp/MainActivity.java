package com.example.sanghs3.synapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl(synapi.baseURL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
                final synapi apiService = retrofit.create(synapi.class);
                String word = "jump";
                Call<scemat> call = apiService.getAnswers(word);

                call.enqueue(new Callback<scemat>() {
                    @Override
                    public void onResponse(Call<scemat> call, Response<scemat> response) {

                        int statusCode = response.code();
                        Log.d(TAG, String.valueOf(statusCode));
                        Log.d(TAG, String.valueOf(response.body().getNoun()));
                    }

                    @Override
                    public void onFailure(Call<scemat> call, Throwable t) {
                        // Log error here since request failed
                        Log.d(TAG, String.valueOf(t));
                    }
                });
            }
            });
        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
