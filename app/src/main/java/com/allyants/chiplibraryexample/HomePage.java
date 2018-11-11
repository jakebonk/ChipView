package com.allyants.chiplibraryexample;

import android.content.Context;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        RelativeLayout parentLayout = (RelativeLayout)findViewById(R.id.r2);

        LayoutInflater layoutInflater = getLayoutInflater();
        View view3;


        LayoutInflater layoutInflator = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        RelativeLayout insertPoint = (RelativeLayout) findViewById(R.id.r2);
        List views = new ArrayList();

        for(int i=0; i<3; i++){
            View view = layoutInflator.inflate(R.layout.feed, null);

           
            view.setLayoutParams(new AbsListView.LayoutParams(AbsListView.LayoutParams.WRAP_CONTENT, AbsListView.LayoutParams.WRAP_CONTENT));
            views.add(view);
        }
        for(int i = 0; i<views.size(); i++)
            insertPoint.addView((View) views.get(i));


            }

    }





