package com.example.dell.activitytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by dell on 2016/7/23.
 */
public class SecondActivity extends Activity {
    private Button bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);
        bt2= (Button) findViewById(R.id.bt2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(SecondActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
