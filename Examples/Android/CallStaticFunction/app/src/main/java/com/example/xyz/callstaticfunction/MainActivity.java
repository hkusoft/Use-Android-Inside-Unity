package com.example.xyz.callstaticfunction;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.xyz.staticfunctionlib.Helper;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String info = Helper.DoSthInAndroid(); // Testing
        TextView tv = (TextView) findViewById(R.id.result_textview);
        tv.setText(info);
    }
}
