package com.aji.userpc.ajirahmatmuhajir_1202154150_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        //melakukan inisiasi pada views
        TextView menuTitle = (TextView)findViewById(R.id.item_title_detail);
        TextView menuPrice = (TextView)findViewById(R.id.item_price_detail);
        TextView menuInfo = (TextView)findViewById(R.id.info_detail);
        ImageView menuImage = (ImageView)findViewById(R.id.menuImages_detail);

        //mengisi views dengan data, dari intent
        menuTitle.setText(getIntent().getStringExtra("title"));
        menuPrice.setText(getIntent().getStringExtra("price"));
        menuInfo.setText(getIntent().getStringExtra("info"));

        Glide.with(this).load(getIntent().getIntExtra("image_",0))
                .into(menuImage);
    }
}
