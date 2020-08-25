package com.zeoflow.z.stream.sample;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;

import com.zeoflow.z.stream.Request;
import com.zeoflow.z.stream.RequestQueue;
import com.zeoflow.z.stream.toolbox.StringRequest;
import com.zeoflow.z.stream.toolbox.Volley;

public class MainActivity extends Activity
{

    public static final String TAG = "MyTag";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);

        StringRequest stringRequest; // Assume this exists.
        RequestQueue requestQueue;  // Assume this exists.

// Set the tag on the request.

// Add the request to the RequestQueue.
        requestQueue = Volley.newRequestQueue(this);
        String url = "https://www.google.com";

// Request a string response from the provided URL.
        stringRequest = new StringRequest(Request.Method.GET, url,
                response ->
                {
                    // Display the first 500 characters of the response string.
                    Log.d("gdfgrtt", response);
                }, error -> Log.d("sdgbfgfdh", "work"));
        stringRequest.setTag(TAG);

// Add the request to the RequestQueue.
        requestQueue.add(stringRequest);
    }
}
