package com.aji.userpc.ajirahmatmuhajir_1202154150_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class dine extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {
    private String mSpinnerLabel = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine);
        //melakukan inisiasi spineer
        Spinner spinner = (Spinner) findViewById(R.id.label_spinner);
        if (spinner != null) {
            spinner.setOnItemSelectedListener(this);
        }
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.labels_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);

        if (spinner != null) {
            spinner.setAdapter(adapter);
        }
    }
    //ketika item pada spinner dipilih
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        mSpinnerLabel = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(this, "Meja yang dipilih : "+mSpinnerLabel, Toast.LENGTH_SHORT).show();
    }
    //ketika tidak ada yang dipilih
    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
    //ketika button pesanan di tekan
    public void onClickPilihpesanan(View view) {
        Intent i = new Intent(this,MenuMakanan.class );
        startActivity(i);
    }
}
