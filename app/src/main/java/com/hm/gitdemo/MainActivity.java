package com.hm.gitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView textView = new ImageView(this);
        textView.setImageResource(R.mipmap.ic_launcher);
        Button btn = new Button(this);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        TextView tt = new TextView(this);
        tt.setText("branch dev1.0");
    }
}
