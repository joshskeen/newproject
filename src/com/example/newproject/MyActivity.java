package com.example.newproject;

import android.app.Activity;
import android.os.Bundle;

public class MyActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        final View viewById = findViewById(R.id.myTextView);
    }
}
