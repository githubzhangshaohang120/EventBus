package com.example.eventbusdemo.viscosity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.eventbusdemo.R;
import com.example.eventbusdemo.message.MessageEvent;

import org.greenrobot.eventbus.EventBus;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {

    /**
     * 你好
     */
    private EditText TET_3;
    /**
     * 发送
     */
    private Button BUT_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        initView();


    }

    private void initView() {
        TET_3 = (EditText) findViewById(R.id.TET_3);
        BUT_3 = (Button) findViewById(R.id.BUT_3);
        BUT_3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.BUT_3:
                String s = TET_3.getText().toString();
                EventBus.getDefault().postSticky(new MessageEvent(s));
                finish();
                break;
        }
    }
}
