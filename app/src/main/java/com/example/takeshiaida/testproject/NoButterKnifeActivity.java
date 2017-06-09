package com.example.takeshiaida.testproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class NoButterKnifeActivity extends AppCompatActivity {
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_butter_knife);

        // IDでViewを取得
        AppCompatButton appCompatButtonClick = (AppCompatButton) findViewById(R.id.click_button);
        final AppCompatTextView appCompatTextView = (AppCompatTextView) findViewById(R.id.textview);
        AppCompatButton appCompatButtonChange = (AppCompatButton) findViewById(R.id.change_button);

        // Viewのクリック処理
        appCompatButtonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appCompatTextView.setText(count++ + " click");
            }
        });

        // Viewのクリック処理
        appCompatButtonChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ButterKnifeActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
