package com.example.takeshiaida.testproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ButterKnifeActivity extends AppCompatActivity {
    private int count = 0;

    // IDでViewを取得
    @BindView(R.id.textview)
    AppCompatTextView appCompatTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butter_knife);
        // ButterKnifeをBindする
        ButterKnife.bind(this);
    }

    // idで指定したViewの
    @OnClick(R.id.click_button)
    public void onClickButton() {
        appCompatTextView.setText(count++ + " click");
    }

    @OnClick(R.id.change_button)
    public void onClickChangeButton() {
        Intent intent = new Intent(this, NoButterKnifeActivity.class);
        startActivity(intent);
        finish();
    }
}