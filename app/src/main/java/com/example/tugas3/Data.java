package com.example.tugas3;

import java.util.ArrayList;

public class Data {
    private static  String[] title = new String[]{"BUMI", "BULAN",
            "MATAHARI", "BINTANG","KOMET", "CEROS & BATOZAR", "KOMET MINOR", "NEBULA", "SELENA"};
    private static int[] thumbnail = new int[]{R.drawable.bumi,R.drawable.bulan,
            R.drawable.matahari, R.drawable.bintang, R.drawable.komet, R.drawable.ceroz, R.drawable.minor, R.drawable.nebula, R.drawable.selena};

    public static ArrayList<Model> getListData(){
        Model model = null;
        ArrayList<Model> list = new ArrayList<>();
        for (int i = 0; i < title.length; i++){
            model = new Model();
            model.setCover(thumbnail[i]);
            model.setJudul(title[i]);
            list.add(model);
        }
        return list;
    }

    public static String getTitle(int posisi) {
        return title[posisi];
    }

    public static int getThumbnail(int posisi) {
        return thumbnail[posisi];
    }

}