package com.bayu.aplikasi_prediksi;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

/**
 * Created by Bayu on 12/23/2016.
 */
public class ListRumah extends Fragment {

    Intent intent;
    ListView listRumah;
    public ListRumah(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_list_rumah, container, false);
        String[]Rumah = {"Type 60 (Lihat Spesifikasi)",
                         "Type 63 (Lihat Spesifikasi)",
                         "Type 74 (Lihat Spesifikasi)",
                         "Type 83 (Lihat Spesifikasi)",
                         "Type 90 (Lihat Spesifikasi)",
                         "Type 102 (Lihat Spesifikasi)",
                         "Type 129 (Lihat Spesifikasi)",
                          "Type 162 (Lihat Spesifikasi)"};
        listRumah = (ListView)rootView.findViewById(R.id.ListRumah);

        ArrayAdapter<String> listRumahAdapter = new ArrayAdapter<String>(
                        getActivity(),
                        android.R.layout.simple_list_item_1,
                        Rumah
        );

        listRumah.setAdapter(listRumahAdapter);
        listRumah.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){

                    Intent intent = new Intent(ListRumah.this.getActivity(),DetailRumah.class);
                    String pos = "0";
                    intent.putExtra("Posisi",pos);
                    startActivity(intent);

                } else if (i == 1){

                    Intent intent = new Intent(ListRumah.this.getActivity(),DetailRumah.class);
                    String pos = "1";
                    intent.putExtra("Posisi",pos);
                    startActivity(intent);

                } else if (i == 2){

                    Intent intent = new Intent(ListRumah.this.getActivity(),DetailRumah.class);
                    String pos = "2";
                    intent.putExtra("Posisi",pos);
                    startActivity(intent);

                } else if (i == 3){

                    Intent intent = new Intent(ListRumah.this.getActivity(),DetailRumah.class);
                    String pos = "3";
                    intent.putExtra("Posisi",pos);
                    startActivity(intent);

                } else if (i == 4){

                    Intent intent = new Intent(ListRumah.this.getActivity(),DetailRumah.class);
                    String pos = "4";
                    intent.putExtra("Posisi",pos);
                    startActivity(intent);

                } else if (i == 5){

                    Intent intent = new Intent(ListRumah.this.getActivity(),DetailRumah.class);
                    String pos = "5";
                    intent.putExtra("Posisi",pos);
                    startActivity(intent);

                } else if (i == 6){

                    Intent intent = new Intent(ListRumah.this.getActivity(),DetailRumah.class);
                    String pos = "6";
                    intent.putExtra("Posisi",pos);
                    startActivity(intent);

                } else if (i == 7){
                    Intent intent = new Intent(ListRumah.this.getActivity(),DetailRumah.class);
                    String pos = "7";
                    intent.putExtra("Posisi",pos);
                    startActivity(intent);

                }
            }
        });

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
