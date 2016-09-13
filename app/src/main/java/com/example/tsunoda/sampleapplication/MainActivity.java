package com.example.tsunoda.sampleapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView i1;
    TextView t1;
    Button b1;
    int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i1 = (ImageView) findViewById(R.id.imageView);
        t1 = (TextView) findViewById(R.id.textView);
        b1 = (Button) findViewById(R.id.button);
        num = 0;

        i1.setImageResource(R.drawable.woman01);

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num += 1;
                t1.setText("年齢は" + num);

                change();
            }
        });

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                num = 0;

                change();
            }
        });

    }

    private void change() {
        if (num < 5)       i1.setImageResource(R.drawable.woman01);
        else if (num < 5)     i1.setImageResource(R.drawable.woman02);
        else if (num < 15)    i1.setImageResource(R.drawable.woman03);
        else if (num < 25)    i1.setImageResource(R.drawable.woman04);
        else if (num < 35)    i1.setImageResource(R.drawable.woman05);
        else                   i1.setImageResource(R.drawable.woman06);
    }
}
