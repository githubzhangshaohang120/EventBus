package com.example.eventbusdemo.viscosity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eventbusdemo.R;
import com.example.eventbusdemo.message.MessageEvent;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class Main4Activity extends AppCompatActivity {

    /**
     * 23132132132
     */
    public TextView text_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        initView();
        EventBus.getDefault().register(this);

    }

    private void initView() {
        text_4 = (TextView) findViewById(R.id.text_4);
        Button viewById = findViewById(R.id.bbbb);
        viewById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in =new Intent(Main4Activity.this,Main3Activity.class);
                startActivity(in);
            }
        });
    }
    @Subscribe(threadMode = ThreadMode.MAIN,sticky = true)
    public  void event(MessageEvent messageEvent){
        text_4.setText(messageEvent.getMessage());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
}
