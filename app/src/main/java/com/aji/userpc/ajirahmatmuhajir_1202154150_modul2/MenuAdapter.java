package com.aji.userpc.ajirahmatmuhajir_1202154150_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import java.util.ArrayList;


public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {
    private ArrayList<itemData> mItemData;
    private Context mContext;

    MenuAdapter(Context context, ArrayList<itemData> mItemData) {
        this.mItemData = mItemData;
        this.mContext = context;
    }


    @Override
    public MenuAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_layout, parent, false));
    }

    // mengganti isi tampilan menu recylcer
    @Override
    public void onBindViewHolder(MenuAdapter.ViewHolder holder, int position) {

        itemData currentMenu = mItemData.get(position);

        holder.bindTo(currentMenu);
        Glide.with(mContext).load(currentMenu.getImageUrl()).into(holder.mMenuImage);

    }

    @Override
    public int getItemCount() {
        return mItemData.size();
    }


    //merepresentasikan setiap row data pada reclyerview
    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


        //view yang ditampilkan pada menu recycler
        private TextView mTitleText;
        private ImageView mMenuImage;
        private TextView mPriceText;


        ViewHolder(View itemView) {
            super(itemView);

            //inisiasi view
            mTitleText = (TextView)itemView.findViewById(R.id.item_title);
            mPriceText = (TextView)itemView.findViewById(R.id.item_price);
            mMenuImage = (ImageView) itemView.findViewById(R.id.menuImages);

            itemView.setOnClickListener(this);
        }

        void bindTo(itemData currentMenu){

            //mengisi view dengan data
            mTitleText.setText(currentMenu.getTitle());
            mPriceText.setText(currentMenu.getPrice());


        }

        //ketika salah satu menu diklik, maka akan berpindah ke detail menu
        @Override
        public void onClick(View view) {

            itemData currentMenu = mItemData.get(getAdapterPosition());
            Intent detailIntent = new Intent(mContext, DetailMenu.class);
            detailIntent.putExtra("title", currentMenu.getTitle());
            detailIntent.putExtra("price", currentMenu.getPrice());
            detailIntent.putExtra("image_", currentMenu.getImageUrl());
            detailIntent.putExtra("info", currentMenu.getInfo());

            //Start the detail activity
            mContext.startActivity(detailIntent);
        }
    }
}
