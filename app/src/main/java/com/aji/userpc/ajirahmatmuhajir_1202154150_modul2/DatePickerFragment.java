package com.aji.userpc.ajirahmatmuhajir_1202154150_modul2;


import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;


public class DatePickerFragment extends DialogFragment
        implements DatePickerDialog.OnDateSetListener {


    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // menggunakan tanggal sekarang sebai tanggal yang dipilih
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        // Cmembuat instance baru dari datepickerdialog
        return new DatePickerDialog(getActivity(), this, year, month, day);
    }

    public void onDateSet(DatePicker view, int year, int month, int day) {
        //yang dilakukan ketika data tanggal dipilih, menginisiasi views text
        TextView dateText = (TextView)getActivity().findViewById(R.id.textTanggal);
        String stringOfDate = day + "/" + month + "/" + year;
        dateText.setText(stringOfDate);
    }

}
