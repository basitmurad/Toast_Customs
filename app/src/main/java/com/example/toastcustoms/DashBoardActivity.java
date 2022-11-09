package com.example.toastcustoms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class DashBoardActivity extends AppCompatActivity {
ToggleButton wifi,hotspot,bluetooth,flightmode,notifications;
Button btnCheck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        wifi=findViewById(R.id.toggle_wifi);
        hotspot=findViewById(R.id.toggle_hotspot);
        bluetooth=findViewById(R.id.toggle_blue);
        flightmode=findViewById(R.id.toggle_flight);
        notifications=findViewById(R.id.toggle_noti);
        btnCheck=findViewById(R.id.btnCheckState);

        /// Getting intent and storing values
      boolean wifiState=     getIntent().getBooleanExtra("wifi",false);
      boolean blueState=     getIntent().getBooleanExtra("bluetooth",false);
      boolean hotspotState=     getIntent().getBooleanExtra("hotspot",false);
      boolean flightState=     getIntent().getBooleanExtra("flight",false);
      boolean notiState=     getIntent().getBooleanExtra("notifications",false);


      //

        wifi.setChecked(wifiState);
        hotspot.setChecked(hotspotState);
        bluetooth.setChecked(blueState);
        flightmode.setChecked(flightState);
        notifications.setChecked(notiState);


btnCheck.setOnClickListener( view -> {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Wifi is " ).append(wifiState);
    stringBuilder.append("\nBluetooth is").append(blueState);
    stringBuilder.append("\nflight mode state is").append(flightState);
    stringBuilder.append("\nhotspot is").append(hotspotState);
    stringBuilder.append("\nnotification are").append(notiState);


    Toast.makeText(this, stringBuilder, Toast.LENGTH_SHORT).show();
});
    }
}