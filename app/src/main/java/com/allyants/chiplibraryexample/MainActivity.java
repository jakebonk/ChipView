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
        data.add("Jacob Bonk");
        data.add("Billy Bonk");
        data.add("Edward Bonk");
        SimpleChipAdapter adapter = new SimpleChipAdapter(data);
        cvTag.setAdapter(adapter);
    }
}
