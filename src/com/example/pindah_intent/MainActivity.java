package com.example.pindah_intent;


import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.os.Build;

public class MainActivity extends Activity {

	@Override
	 public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
 
        Button go = (Button)findViewById(R.id.btnAthena);
 
        go.setOnClickListener(new View.OnClickListener() {
 
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(MainActivity.this, Child.class);
                i.putExtra("pesan", "From Activity Main");
                startActivity(i);
            }
        });
    }
}