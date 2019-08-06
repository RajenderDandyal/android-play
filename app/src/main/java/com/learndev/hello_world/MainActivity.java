package com.learndev.hello_world;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity implements View.OnClickListener {
    private static final String TAG = MainActivity.class.getSimpleName();
    Button mFirstButton, mSecondButton ;
    String msg = "Android : ";

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg, "The onCreate() event");
        mFirstButton = (Button) findViewById(R.id.mFirstButton);
        mSecondButton = (Button) findViewById(R.id.button6);

        mFirstButton.setOnClickListener(MainActivity.this);
        mSecondButton.setOnClickListener(MainActivity.this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.mFirstButton:
                Log.d(TAG, "onClick: First Button");
                break;
            case R.id.button6:
                Log.d(TAG, "onClick: Second Button");
                break;
        }

    }
}