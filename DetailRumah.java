package com.bayu.aplikasi_prediksi;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Bayu on 12/24/2016.
 */
public class DetailRumah extends AppCompatActivity {

    ImageView img;
    TextView txtJudul, txtkt, txtkm, txtair, txtlistrik;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_rumah_activity);
        DetilRumah();
    }

    private void DetilRumah() {
        img         = (ImageView)findViewById(R.id.imgRumah);
        txtJudul    = (TextView)findViewById(R.id.Judul);
        txtkt       = (TextView)findViewById(R.id.txtKamar);
        txtkm       = (TextView)findViewById(R.id.txtKM);
        txtair      = (TextView)findViewById(R.id.txtAir);
        txtlistrik  = (TextView)findViewById(R.id.txtListrik);
        Intent intent = getIntent();
        int Posisi = Integer.parseInt(intent.getStringExtra("Posisi"));
        switch (Posisi){
            case 0 :
                img.setImageResource(R.drawable.type_60);
                txtJudul.setText("Type 60");
                txtkt.setText("2 Kamar Tidur");
                txtkm.setText("1 Kamar Mandi");
                txtair.setText("Air PDAM");
                txtlistrik.setText("Listrik 220V");
                break;

            case 1 :
                img.setImageResource(R.drawable.type_63);
                txtJudul.setText("Type 63");
                txtkt.setText("2 Kamar Tidur");
                txtkm.setText("1 Kamar Mandi");
                txtair.setText("Air PDAM");
                txtlistrik.setText("Listrik 220V");
                break;

            case 2 :
                img.setImageResource(R.drawable.type_74);
                txtJudul.setText("Type 74");
                txtkt.setText("2 Kamar Tidur");
                txtkm.setText("2 Kamar Mandi");
                txtair.setText("Air PDAM");
                txtlistrik.setText("Listrik 220V");
                break;

            case 3 :
                img.setImageResource(R.drawable.type_83);
                txtJudul.setText("Type 83");
                txtkt.setText("3 Kamar Tidur");
                txtkm.setText("2 Kamar Mandi");
                txtair.setText("Air PDAM");
                txtlistrik.setText("Listrik 220V");
                break;

            case 4 :
                img.setImageResource(R.drawable.type_93);
                txtJudul.setText("Type 93");
                txtkt.setText("3 Kamar Tidur");
                txtkm.setText("2 Kamar Mandi");
                txtair.setText("Air PDAM");
                txtlistrik.setText("Listrik 220V");
                break;

            case 5 :
                img.setImageResource(R.drawable.type_102);
                txtJudul.setText("Type 102");
                txtkt.setText("3 Kamar Tidur");
                txtkm.setText("2 Kamar Mandi");
                txtair.setText("Air PDAM");
                txtlistrik.setText("Listrik 220V");
                break;

            case 6 :
                img.setImageResource(R.drawable.type_129);
                txtJudul.setText("Type 129");
                txtkt.setText("4 Kamar Tidur Dua Lantai");
                txtkm.setText("2 Kamar Mandi");
                txtair.setText("Air PDAM");
                txtlistrik.setText("Listrik 220V");
                break;

            case 7 :
                img.setImageResource(R.drawable.type_162);
                txtJudul.setText("Type 162");
                txtkt.setText("4 Kamar Tidur Dua Lantai");
                txtkm.setText("3 Kamar Mandi");
                txtair.setText("Air PDAM");
                txtlistrik.setText("Listrik 220V");
                break;
        }

    }
}
