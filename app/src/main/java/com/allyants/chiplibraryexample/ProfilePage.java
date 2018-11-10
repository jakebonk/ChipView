package com.allyants.chiplibraryexample;


import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


import org.w3c.dom.Text;

import java.io.IOException;

import io.github.mthli.knife.KnifeText;

public class ProfilePage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);




        final TextView t0 = (TextView)findViewById(R.id.t0);
        ImageView mShowDialog0 = (ImageView) findViewById(R.id.location);
        mShowDialog0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(ProfilePage.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_link0, null);
                final EditText etlink = (EditText) mView.findViewById(R.id.etLink0);
                Button insertLink = (Button) mView.findViewById(R.id.insertLink0);


                mBuilder.setView(mView);
                final AlertDialog dialog = mBuilder.create();
                dialog.show();
                insertLink.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (!etlink.getText().toString().isEmpty()) {
                            Toast.makeText(ProfilePage.this,
                                    "Location added",
                                    Toast.LENGTH_SHORT).show();
                            dialog.dismiss();

                            String setLink = etlink.getText().toString();
                            t0.setText(setLink);
                        } else {
                            Toast.makeText(ProfilePage.this,
                                    "Location not added",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }

        });

        final TextView t1 = (TextView)findViewById(R.id.t1);
        ImageView mShowDialog = (ImageView) findViewById(R.id.link);
        mShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(ProfilePage.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_link, null);
                final EditText etlink = (EditText) mView.findViewById(R.id.etLink);
                Button insertLink = (Button) mView.findViewById(R.id.insertLink);


                mBuilder.setView(mView);
                final AlertDialog dialog = mBuilder.create();
                dialog.show();
                insertLink.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (!etlink.getText().toString().isEmpty()) {
                            Toast.makeText(ProfilePage.this,
                                    "Link Inserted",
                                    Toast.LENGTH_SHORT).show();
                            dialog.dismiss();

                            String setLink = etlink.getText().toString();
                            t1.setText(setLink);
                        } else {
                            Toast.makeText(ProfilePage.this,
                                    "Link not Inserted",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }

        });

        final TextView t2 = (TextView)findViewById(R.id.t2);
        ImageView mShowDialog2 = (ImageView) findViewById(R.id.link2);
        mShowDialog2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(ProfilePage.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_link, null);
                final EditText etlink = (EditText) mView.findViewById(R.id.etLink);
                Button insertLink = (Button) mView.findViewById(R.id.insertLink);


                mBuilder.setView(mView);
                final AlertDialog dialog = mBuilder.create();
                dialog.show();
                insertLink.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (!etlink.getText().toString().isEmpty()) {
                            Toast.makeText(ProfilePage.this,
                                    "Link Inserted",
                                    Toast.LENGTH_SHORT).show();
                            dialog.dismiss();
                            String setLink2 = etlink.getText().toString();
                            t2.setText(setLink2);
                        } else {
                            Toast.makeText(ProfilePage.this,
                                    "Link not Inserted",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }

        });

        final ImageView partOf = (ImageView) findViewById(R.id.partOf);
        final ImageView ideas = (ImageView) findViewById(R.id.ideas);

        ideas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ideas.setBackgroundColor(Color.parseColor("#31373d"));

                partOf.setBackgroundColor(Color.parseColor("#999999"));


                LinearLayout parentLayout = (LinearLayout)findViewById(R.id.layout);

                // Layout inflater
                LayoutInflater layoutInflater = getLayoutInflater();
                View view2;

                for (int i = 1; i < 20; i++){
                    // Add the text layout to the parent layout
                    view2 = layoutInflater.inflate(R.layout.text_layout, parentLayout, false);

                    // In order to get the view we have to use the new view with text_layout in it
                    TextView textView = (TextView)view2.findViewById(R.id.text);
                    textView.setText("Row " + i);

                    // Add the text view to the parent layout
                    parentLayout.addView(textView);
                }
            }
        });


        partOf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int colorValue = Color.parseColor("#31373d");

                partOf.setBackgroundColor(colorValue);
                LinearLayout parentLayout = (LinearLayout)findViewById(R.id.layout);

                ideas.setBackgroundColor(Color.parseColor("#999999"));

                final TextView textView = (TextView)findViewById(R.id.text);
                textView.setText(null);

                // Layout inflater
                LayoutInflater layoutInflater = getLayoutInflater();
                View view3;

                for (int i = 20; i < 40; i++){
                    // Add the text layout to the parent layout
                    view3 = layoutInflater.inflate(R.layout.text_layout, parentLayout, false);

                    // In order to get the view we have to use the new view with text_layout in it
                    TextView textView1 = (TextView)view3.findViewById(R.id.text);
                    textView1.setText("Row " + i);

                    // Add the text view to the parent layout
                    parentLayout.addView(textView1);
                }
            }
        });
    }
}



