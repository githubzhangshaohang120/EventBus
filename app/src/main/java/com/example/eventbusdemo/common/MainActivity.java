package com.example.eventbusdemo.common;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.eventbusdemo.R;
import com.example.eventbusdemo.message.MessageEvent;

import org.greenrobot.eventbus.EventBus;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * 要输入的内容
     */
    private EditText mEditContent;
    /**
     * 接收值
     */
    private Button mBtnSend;
    private String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        mEditContent = (EditText) findViewById(R.id.edit_content);
        mBtnSend = (Button) findViewById(R.id.btn_send);
        mBtnSend.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.btn_send:
                s = mEditContent.getText().toString();
                EventBus.getDefault().post(new MessageEvent(s));
                finish();
                break;

        }
    }
}
