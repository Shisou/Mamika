package com.example.admin.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ripMamika(View view){
        Button btnMamika = (Button)view;
        String status = (String) btnMamika.getTag();
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.layoutid);
        if(status.equals("true")) {
            layout.setBackgroundResource(R.drawable.ripmamika2);
            btnMamika.setText(R.string.mamikabutton);
            btnMamika.setTag("false");
        }else{
            layout.setBackgroundResource(R.drawable.ripmamika);
            btnMamika.setText(R.string.ripbutton);
            btnMamika.setTag("true");

        }
    }

}
