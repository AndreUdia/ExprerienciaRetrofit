package com.example.andre.exprerienciaretrofit;

import com.example.andre.exprerienciaretrofit.models.UdacityCatalog;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UdacityService {

    public static final String BASE_URL = "https://www.udacity.com/public-api/v0/courses";

    @GET("courses")
    Call<UdacityCatalog> ListCatalog();

}
