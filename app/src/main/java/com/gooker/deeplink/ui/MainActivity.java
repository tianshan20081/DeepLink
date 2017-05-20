package com.gooker.deeplink.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.gooker.deeplink.R;

public class MainActivity extends AppCompatActivity {

    private final String TAG = MainActivity.this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        if (Intent.ACTION_VIEW == intent.getAction()) {
            Uri data = getIntent().getData();
            if (null != data) {
                String host = data.getHost();
                String path = data.getPath();
                
                String query = data.getQuery();
                Log.e(TAG, host);
                Log.e(TAG, path);
                Log.e(TAG, query);
            }
        }

    }
}
