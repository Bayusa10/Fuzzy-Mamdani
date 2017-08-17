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
public class DetailHarga extends AppCompatActivity {

    TextView txtJudul,Tanah,Bangunan,SSB,Total;
    ImageView img;
    String [][] Harga;
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_harga_activity);
        DetilHarga();
    }

    private void DetilHarga() {
        txtJudul    = (TextView)findViewById(R.id.txtJudul);
        Tanah       = (TextView)findViewById(R.id.txtTanah);
        Bangunan    = (TextView)findViewById(R.id.txtBangunan);
        SSB         = (TextView)findViewById(R.id.txtSSB);
        Total       = (TextView)findViewById(R.id.txtTotal);
        img         = (ImageView)findViewById(R.id.imgRumahHarga);
        Harga = new String [4][8];
        //Harga type 60
        Harga[0][0] = "Rp.194.250.000";
        Harga[1][0] = "Rp.147.000.000";
        Harga[2][0] = "Rp.18.800.000";
        Harga[3][0] = "Rp.360.050.000";

        //Harga Type 63
        Harga[0][1] = "Rp.216.450.000";
        Harga[1][1] = "Rp.154.350.000";
        Harga[2][1] = "Rp.20.600.000";
        Harga[3][1] = "Rp.391.400.000";

        //Harga Type 74
        Harga[0][2] = "Rp.249.750.000";
        Harga[1][2] = "Rp.189.800.000";
        Harga[2][2] = "Rp.24.025.000";
        Harga[3][2] = "Rp.463.575.000";

        //Harga Type 83
        Harga[0][3] = "Rp.333.000.000";
        Harga[1][3] = "Rp.215.800.000";
        Harga[2][3] = "Rp.29.775.000";
        Harga[3][3] = "Rp.578.575.000";

        //Harga Type 93
        Harga[0][4] = "Rp.333.000.000";
        Harga[1][4] = "Rp.260.400.000";
        Harga[2][4] = "Rp.32.250.000";
        Harga[3][4] = "Rp.625.650.000";
        //Harga Type 102
        Harga[0][5] = "Rp.370.000.000";
        Harga[1][5] = "Rp.285.600.000";
        Harga[2][5] = "Rp.35.700.000";
        Harga[3][5] = "Rp.691.300.000";

        //Harga Type 129
        Harga[0][6] = "Rp.444.000.000";
        Harga[1][6] = "Rp.361.200.000";
        Harga[2][6] = "Rp.44.000.000";
        Harga[3][6] = "Rp.849.200.000";

        //Harga Type 162
        Harga[0][7] = "Rp.555.000.000";
        Harga[1][7] = "Rp.502.200.000";
        Harga[2][7] = "Rp.55.725.000";
        Harga[3][7] = "Rp.1.112.925.000";

        Intent intent = getIntent();
        int Posisi = Integer.parseInt(intent.getStringExtra("Posisi"));

        switch (Posisi){

            case 0 :
                img.setImageResource(R.drawable.type_60);
                txtJudul.setText("Harga Jual Type 60");
                Tanah.setText("Harga Tanah : " +" "+Harga[0][0]);
                Bangunan.setText("Harga Bagunan : "+" "+Harga[1][0]);
                SSB.setText("Harga SSB : "+" "+Harga[2][0]);
                Total.setText("Total Harga : "+" "+Harga[3][0]);
                break;

            case 1 :
                img.setImageResource(R.drawable.type_63);
                txtJudul.setText("Harga Jual Type 63");
                Tanah.setText("Harga Tanah : " +" "+Harga[0][1]);
                Bangunan.setText("Harga Bagunan : "+" "+Harga[1][1]);
                SSB.setText("Harga SSB : "+" "+Harga[2][1]);
                Total.setText("Total Harga : "+" "+Harga[3][1]);
                break;

            case 2 :
                img.setImageResource(R.drawable.type_74);
                txtJudul.setText("Harga Jual Type 74");
                Tanah.setText("Harga Tanah : " +" "+Harga[0][2]);
                Bangunan.setText("Harga Bagunan : "+" "+Harga[1][2]);
                SSB.setText("Harga SSB : "+" "+Harga[2][2]);
                Total.setText("Total Harga : "+" "+Harga[3][2]);
                break;

            case 3 :
                img.setImageResource(R.drawable.type_83);
                txtJudul.setText("Harga Jual Type 83");
                Tanah.setText("Harga Tanah : " +" "+Harga[0][3]);
                Bangunan.setText("Harga Bagunan : "+" "+Harga[1][3]);
                SSB.setText("Harga SSB : "+" "+Harga[2][3]);
                Total.setText("Total Harga : "+" "+Harga[3][3]);
                break;

            case 4 :
                img.setImageResource(R.drawable.type_93);
                txtJudul.setText("Harga Jual Type 93");
                Tanah.setText("Harga Tanah : " +" "+Harga[0][4]);
                Bangunan.setText("Harga Bagunan : "+" "+Harga[1][4]);
                SSB.setText("Harga SSB : "+" "+Harga[2][4]);
                Total.setText("Total Harga : "+" "+Harga[3][4]);
                break;

            case 5 :
                img.setImageResource(R.drawable.type_102);
                txtJudul.setText("Harga Jual Type 102");
                Tanah.setText("Harga Tanah : " +" "+Harga[0][5]);
                Bangunan.setText("Harga Bagunan : "+" "+Harga[1][5]);
                SSB.setText("Harga SSB : "+" "+Harga[2][5]);
                Total.setText("Total Harga : "+" "+Harga[3][5]);
                break;

            case 6 :
                img.setImageResource(R.drawable.type_129);
                txtJudul.setText("Harga Jual Type 129");
                Tanah.setText("Harga Tanah : " +" "+Harga[0][7]);
                Bangunan.setText("Harga Bagunan : "+" "+Harga[1][7]);
                SSB.setText("Harga SSB : "+" "+Harga[2][7]);
                Total.setText("Total Harga : "+" "+Harga[3][7]);
                break;

            case 7 :
                img.setImageResource(R.drawable.type_162);
                txtJudul.setText("Harga Jual Type 162");
                Tanah.setText("Harga Tanah : " +" "+Harga[0][8]);
                Bangunan.setText("Harga Bagunan : "+" "+Harga[1][8]);
                SSB.setText("Harga SSB : "+" "+Harga[2][8]);
                Total.setText("Total Harga : "+" "+Harga[3][8]);
                break;
        }
    }
}
