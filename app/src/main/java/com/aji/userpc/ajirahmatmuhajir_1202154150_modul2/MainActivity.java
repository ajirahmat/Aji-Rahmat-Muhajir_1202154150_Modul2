package com.aji.userpc.ajirahmatmuhajir_1202154150_modul2;

import android.content.Intent;
import android.support.v4.content.IntentCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // membuat variable yang akan di pakai
    RadioGroup radio;
    RadioButton radiobutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "AJI RAHMAT MUHAJIR_1202154150", Toast.LENGTH_SHORT).show();

    }

    //ketika radio button diklik
    public void onRadioButtonClicked(View view) {
        // apakah radio button ter centang?
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.dine:
                if (checked)
                    Toast.makeText(this, "Dine in", Toast.LENGTH_SHORT).show();
                break;
            case R.id.takeaway:
                if (checked)
                    Toast.makeText(this, "Take away", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }

    //ketika mengklik button pesanan,apakah memilih dine in atau take away?
    public void onClick(View view) {
        radio = (RadioGroup) findViewById(R.id.radioGroup);
        int selected_id = radio.getCheckedRadioButtonId();
        radiobutton = (RadioButton) findViewById(selected_id);
        String pilihan = radiobutton.getText().toString();

        if (pilihan.equals("Dine In")) {
            Intent i =  new Intent(this, dine.class);
            startActivity(i);
        }
        else if(pilihan.equals("Take away")){
            Intent i = new Intent(this, takeaway.class);
            startActivity(i);
        }

        else if (pilihan.equals(null))
            Toast.makeText(this, "Silahkan Pilih dine in atau take away ", Toast.LENGTH_SHORT).show();

    }


}
