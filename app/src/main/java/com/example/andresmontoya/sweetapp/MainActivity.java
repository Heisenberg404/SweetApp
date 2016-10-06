package com.example.andresmontoya.sweetapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import cn.pedant.SweetAlert.SweetAlertDialog;

public class MainActivity extends AppCompatActivity {

    SweetAlertDialog sweetAlertDialog;
    Button btnError;
    Button btnSuccess;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnError = (Button)findViewById(R.id.btnError);
        btnSuccess = (Button)findViewById(R.id.btnSuccess);

        btnSuccess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new SweetAlertDialog(MainActivity.this, SweetAlertDialog.SUCCESS_TYPE)
                .setTitleText("Exito!")
                .setContentText("pasamos!")
                .show();
            }
        });

        btnError.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new SweetAlertDialog(MainActivity.this, SweetAlertDialog.ERROR_TYPE)
                        .setTitleText("CAgada!")
                        .setContentText("no pasamos!")
                        .show();
            }
        });
    }
}
