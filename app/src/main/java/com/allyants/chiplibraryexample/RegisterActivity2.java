package com.allyants.chiplibraryexample;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.allyants.chipview.ChipView;
import com.allyants.chipview.SimpleChipAdapter;

import java.util.ArrayList;

import static android.os.Build.VERSION_CODES.N;

public class RegisterActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);
        final EditText etSearch = (EditText) findViewById(R.id.etSearch);

        etSearch.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int colorValue = Color.parseColor("#3e454c");
                LinearLayout linLay = (LinearLayout) findViewById(R.id.l1);
                linLay.setBackgroundColor(colorValue);
                ChipView cvTag = (ChipView)findViewById(R.id.cvTag);
                ArrayList<Object> data = new ArrayList<>();
                data.add("C");
                data.add("C++");
                data.add("Java");
                data.add("HTML");
                data.add("Javascript");
                data.add("Python");
                data.add("CSS");
                SimpleChipAdapter adapter = new SimpleChipAdapter(data);
                cvTag.setAdapter(adapter);

                LinearLayout l1 = (LinearLayout) findViewById(R.id.l1);
                int width = 600;
                int height = 415;
                LinearLayout.LayoutParams parms = new LinearLayout.LayoutParams(width, height);
                l1.setLayoutParams(parms);
            }
        });
    }

}

