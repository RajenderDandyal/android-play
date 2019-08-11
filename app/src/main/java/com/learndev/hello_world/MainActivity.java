package com.learndev.hello_world;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnClickListener {
    private static final String TAG = MainActivity.class.getSimpleName();
    TextView helloWorld, hiiWorld;
    Button mFirstButton, mSecondButton;
    String msg = "Android : ";
    private Boolean isHelloWorldShowing = true;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg, "The onCreate() event");
        mFirstButton = (Button) findViewById(R.id.button1);
        mSecondButton = (Button) findViewById(R.id.button2);

        helloWorld = findViewById(R.id.textHello);
        hiiWorld = findViewById(R.id.textHii);

        helloWorld.setOnClickListener(MainActivity.this);
        //hiiWorld.setOnClickListener(MainActivity.this);
        mFirstButton.setOnClickListener(MainActivity.this);
        mSecondButton.setOnClickListener(MainActivity.this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                Log.d(TAG, "onClick: First Button");
                mFirstButton.animate().rotation(360f).translationY(1000f).alpha(0).setDuration(5000);

                break;
            case R.id.button2:
                Log.d(TAG, "onClick: Second Button");
                break;
            case R.id.textHello:

                Log.d(TAG, "onClick: Hello world");
                if (isHelloWorldShowing){
                    helloWorld.animate().alpha(0).setDuration(1000);
                    hiiWorld.animate().alpha(1).setDuration(1000);
                    isHelloWorldShowing = false;
                } else if (!isHelloWorldShowing){
                    helloWorld.animate().alpha(1).setDuration(1000);
                    hiiWorld.animate().alpha(0).setDuration(1000);
                    isHelloWorldShowing = true;
                }

                break;


        }

    }
}
