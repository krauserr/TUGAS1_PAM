package com.example.pindah_intent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Child extends Activity{
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.child);
 
        TextView txtChild = (TextView)findViewById(R.id.child_txtPage);
        Button go = (Button)findViewById(R.id.child_btnPage);
 
        //menerima Intent yang dikirim
        Intent i = this.getIntent();
        txtChild.setText("This is child "+i.getStringExtra("pesan"));
 
        go.setOnClickListener(new View.OnClickListener() {
 
            public void onClick(View v) {
                // TODO Auto-generated method stub
                finish();
            }
        });
    }
 
}


