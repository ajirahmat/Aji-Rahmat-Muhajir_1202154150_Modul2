package com.aji.userpc.ajirahmatmuhajir_1202154150_modul2;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class takeaway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takeaway);
    }

    //ketika buttonpesanan di klik
    public void onClickPilihpesanan(View view) {
        Intent i = new Intent(this, MenuMakanan.class);
        startActivity(i);

    }

    //ketika menekan button tanggal
    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(),
                getString(R.string.date_picker));

    }
    //ketika menekan button waktu
    public void showTimePickerDialog(View view) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(),
                getString(R.string.time_picker));
    }
}
