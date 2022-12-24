package com.example.pinjambuku.API;

import com.example.pinjambuku.Model.ResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIRequestData {
    @GET("ambildata.php")
    Call<ResponseModel> ardAmbilData();
}
