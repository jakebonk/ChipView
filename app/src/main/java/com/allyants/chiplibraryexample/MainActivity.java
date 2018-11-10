package com.allyants.chiplibraryexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.allyants.chipview.ChipView;
import com.allyants.chipview.SimpleChipAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ChipView cvTag = (ChipView)findViewById(R.id.cvTag);
        ArrayList<Object> data = new ArrayList<>();
        data.add("C");
        data.add("C++");
        data.add("Java");
        data.add("HTML");
        data.add("CSS");
        data.add("JavaScript");
        data.add("Seventh Item");
        SimpleChipAdapter adapter = new SimpleChipAdapter(data);
        cvTag.setAdapter(adapter);
    }
}
