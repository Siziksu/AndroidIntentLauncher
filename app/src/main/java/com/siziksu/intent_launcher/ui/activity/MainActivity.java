package com.siziksu.intent_launcher.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.siziksu.intent_launcher.R;

public class MainActivity extends Activity implements View.OnClickListener {

    public static final String EXTRAS_NAME = "name";
    public static final String EXTRAS_AGE = "age";
    public static final String EXTRAS_WEIGHT = "weight";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        findViewById(R.id.btn_launch).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_launch:
                Intent intent = new Intent();
                intent.setAction("com.siziksu.intents.action.MANIFEST");
                intent.putExtra(EXTRAS_NAME, "Esteban");
                intent.putExtra(EXTRAS_AGE, "40");
                intent.putExtra(EXTRAS_WEIGHT, "65");
                sendBroadcast(intent);
                break;
        }
    }
}
