package com.bayu.aplikasi_prediksi;

/**
 * Created by Bayu on 12/25/2016.
 */
public interface MamdaniInterface {

    void Rule();
    void Fuzzyfikasi(double LuasTanah, double LuasBangunan, double SSB);
    void ImplikasiMin();
    void ImplikasiMax();
    void BatasArea();
    void Momen();
    void Luas();
    void MomenLuas();
    void HargaJual();
}
