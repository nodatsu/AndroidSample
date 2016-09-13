package com.example.tsunoda.sampleapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1;
    Button b1;
    int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = (TextView) findViewById(R.id.textView);
        b1 = (Button) findViewById(R.id.button);
        num = 0;

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (num % 3 == 0) {
                    t1.setText("おはよう。" + num);
                }
                else if (num % 3 == 1) {
                    t1.setText("こんにちは。" + num);
                }
                else {
                    t1.setText("こんばんは。" + num);
                }
                num += 1;
            }
        });
    }
}
