package com.example.yvtc.s030904;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView act;
    String str[] = {"AAA","AAB","ABC","ABB","CCC","BBC","BBB"};

    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        act = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        iv = (ImageView) findViewById(R.id.imageView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, str);
        act.setAdapter(adapter);
        act.setThreshold(1);
    }

    public void click1(View v)
    {
        iv.setImageResource(R.drawable.flower1);

    }
    public void click2(View v)
    {
        iv.setImageResource(R.drawable.flower2);
    }

}
