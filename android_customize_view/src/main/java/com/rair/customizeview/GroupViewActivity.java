package com.rair.customizeview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.rair.customizeview.view.GroupView;

public class GroupViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_view);

        GroupView groupView = (GroupView) findViewById(R.id.m_groupview);
        groupView.setOnFinishListener(new GroupView.OnFinishListener() {
            @Override
            public void onFinish() {
                finish();
            }
        });
    }
}
