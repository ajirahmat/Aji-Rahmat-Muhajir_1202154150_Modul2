package com.aji.userpc.ajirahmatmuhajir_1202154150_modul2;

public class itemData {

    private String title;
    private int imageUrl;
    private String info;
    private String price;

    public itemData(String title,String info, String price,int imageUrl){

        this.title = title;
        this.imageUrl = imageUrl;
        this.info = info;
        this.price =price;
    }
    //melaklukan get image
    public int getImageUrl() {
        return imageUrl;
    }
    //melakukan get judulmenu
    public String getTitle() {
        return title;
    }
    //melakukan get hargamenu
    public String getPrice() {
        return price;
    }
    //melakukan get infomenu
    public String getInfo() {
        return info;
    }
}
