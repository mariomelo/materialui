package com.example.mario.materialui;

import android.content.ComponentName;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v4.content.IntentCompat;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        Toolbar toolbar = (Toolbar) findViewById(R.id.my_awesome_toolbar);
        ((TextView) findViewById(R.id.toolbar_title)).setVisibility(View.VISIBLE);
        ((TextView) findViewById(R.id.toolbar_title))
                .setText("Second Activity");
        toolbar.setNavigationIcon(R.drawable.ic_up);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavUtils.navigateUpTo(SecondActivity.this, IntentCompat
                        .makeMainActivity(new ComponentName(
                                SecondActivity.this, SecondActivity.class)));
            }
        });
    }
}