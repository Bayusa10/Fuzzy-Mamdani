package com.bayu.aplikasi_prediksi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
/**
 * Created by Bayu on 12/25/2016.
 */
public class PrediksiMamdani extends AppCompatActivity {
    FuzzyMamdani Mamdani = new FuzzyMamdani();
    private EditText LuasTanah, LuasBangunan, SSB;
    private TextView  HargaJual;
    private Button Proses;
    private View.OnClickListener click;
    DecimalFormat DF = new DecimalFormat("#.###");
    private Thread myThread;
    double hasil;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prediksi);
        LuasTanah       = (EditText) findViewById(R.id.luasTanah);
        LuasBangunan    = (EditText) findViewById(R.id.luasTanah);
        SSB             = (EditText) findViewById(R.id.ssb);
        HargaJual       = (TextView)findViewById(R.id.hargajual);
        Proses = (Button) findViewById(R.id.prediksi);
        prediksi();

    }

    private void prediksi() {
        click = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (myThread == null || myThread.getState() == Thread.State.TERMINATED) {
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                final double luasTanah = Double.parseDouble(LuasTanah.getText().toString());
                                final double luasBangunan = Double.parseDouble(LuasBangunan.getText().toString());
                                final double ssb = Double.parseDouble(SSB.getText().toString());
                                Mamdani.Rule();
                                Mamdani.Fuzzyfikasi(luasTanah,luasBangunan,ssb);
                                Mamdani.ImplikasiMin();
                                Mamdani.ImplikasiMax();
                                Mamdani.BatasArea();
                                Mamdani.Momen();
                                Mamdani.Luas();
                                Mamdani.MomenLuas();
                                Mamdani.HargaJual();
                                hasil = Double.parseDouble(DF.format(Mamdani.getHargaJual()));
                                HargaJual.setText("Rp."+String.valueOf(hasil));
                            } catch (Exception ex){
                                ex.printStackTrace();
                            }
                        }
                    }).start();
                }
            }
        };

        Proses.setOnClickListener(click);
    }
}
