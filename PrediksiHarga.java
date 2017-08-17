package com.bayu.aplikasi_prediksi;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Bayu on 12/23/2016.
 */
public class PrediksiHarga extends Fragment implements OnClickListener{

    Button btn;
    View view;
    Intent intent;
    public PrediksiHarga(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_prediksi, container, false);
        btn  = (Button)view.findViewById(R.id.btnPredikis);
        btn.setOnClickListener(this);
        return view;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onClick(View view) {
        intent = new Intent(PrediksiHarga.this.getActivity(),PrediksiMamdani.class);
        startActivity(intent);
    }
}
