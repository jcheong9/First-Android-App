package ca.bcit.firstandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    boolean toggle = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
    }

    public void BtnToggleClick(View view) {
        TextView tvHello = findViewById(R.id.textView);
        if(toggle){
            tvHello.setText(tvHello.getText().toString().toLowerCase());
        }else{
            tvHello.setText(tvHello.getText().toString().toUpperCase());
        }
        toggle = !toggle;
    }
}
