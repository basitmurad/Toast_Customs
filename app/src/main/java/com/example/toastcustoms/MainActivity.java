package com.example.toastcustoms;

import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Switch wifi,bluetooth,hotspot,flightMode,notifications;
    private  Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wifi=findViewById(R.id.switch_wifi);
        bluetooth=findViewById(R.id.switch_blue);
        hotspot=findViewById(R.id.switch_hot);
        flightMode=findViewById(R.id.switch_flight);
        notifications=findViewById(R.id.switch_noti);
        btnSubmit=findViewById(R.id.btn_submit);





        btnSubmit.setOnClickListener(view -> {

            Intent intent =new Intent(MainActivity.this,DashBoardActivity.class);

            intent.putExtra("wifi",wifi.isChecked());
            intent.putExtra("bluetooth",bluetooth.isChecked());
            intent.putExtra("hotspot",hotspot.isChecked());
            intent.putExtra("flight",flightMode.isChecked());
            intent.putExtra("notifications",notifications.isChecked());

            startActivity(intent);

        });




    }

}