package com.allyants.chiplibraryexample;

import android.content.Context;
import android.provider.ContactsContract;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends AppCompatActivity {

    boolean isOn = false;
    View navView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);


        final LayoutInflater layoutInflator = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        LinearLayout insertPoint = (LinearLayout) findViewById(R.id.r2);
        List views = new ArrayList();

        for (int i = 0; i < 3; i++) {
            View view = layoutInflator.inflate(R.layout.feed, null);
            view.setLayoutParams(new AbsListView.LayoutParams(AbsListView.LayoutParams.WRAP_CONTENT, AbsListView.LayoutParams.WRAP_CONTENT));
            views.add(view);
        }

        for (int i = 0; i < views.size(); i++)
            insertPoint.addView((View) views.get(i));

        ImageView right = (ImageView)findViewById(R.id.right);
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isOn) {
                    ImageView right = (ImageView)findViewById(R.id.right);
                    RelativeLayout nav = (RelativeLayout)findViewById(R.id.nav);
                    navView = layoutInflator.inflate(R.layout.rightside, null);
                    nav.addView(navView);
                }
                else {
                    RelativeLayout nav = (RelativeLayout)findViewById(R.id.nav);
                    nav.removeView(navView);
                }
                isOn = !isOn;
            }
        });


    }





}