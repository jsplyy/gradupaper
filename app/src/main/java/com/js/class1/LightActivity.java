package com.js.class1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class LightActivity extends AppCompatActivity {

    private ImageView light5 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        light5 = (ImageView)findViewById(R.id.light5);
        final int resid = R.id.light5;
        light5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (light5.getDrawable().getCurrent().getConstantState().equals(getResources().getDrawable(R.drawable.light_on).getConstantState())) {

                    light5.setImageResource(R.drawable.light_off);

                }
                else{
                    light5.setImageResource(R.drawable.light_on);
                }

            }

        });
    }

}
