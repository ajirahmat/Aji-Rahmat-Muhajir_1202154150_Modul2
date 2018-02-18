package com.aji.userpc.ajirahmatmuhajir_1202154150_modul2;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.LinkedList;

public class MenuMakanan extends AppCompatActivity {

    //mendefinisikan variable
    private RecyclerView mRecyclerView;
    private ArrayList<itemData> mItemData;
    private MenuAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_makanan);

        //inisiasi recylcer view
        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);

        //Set the Layout Manager
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        //inisiasi arraylist yang akan di isi oleh data
        mItemData = new ArrayList<>();

        //inisiasi adapter
        mAdapter = new MenuAdapter(this, mItemData);
        mRecyclerView.setAdapter(mAdapter);

        //mendapatkan data dari object data
        initializeData();

    }

    private void initializeData() {

        //mendapatkan resource dari file xml
        String[] menuTitle = getResources().getStringArray(R.array.menu_titles);
        String[] menuInfo = getResources().getStringArray(R.array.menu_info);
        String[] menuPrice = getResources().getStringArray(R.array.menu_price);
        TypedArray menuImageResources =
                getResources().obtainTypedArray(R.array.menu_images);

        //melakukan clear pada data yang ada, agar tidak terjadi duplikasi
        mItemData.clear();

        //membuat arraylist dari objek menu dengan title,info,harga dan gambar
        for(int i=0;i<menuTitle.length;i++){
            mItemData.add(new itemData(menuTitle[i],menuInfo[i],menuPrice[i],
                    menuImageResources.getResourceId(i,0)));
        }

        menuImageResources.recycle();
        mAdapter.notifyDataSetChanged();
    }


}
