package com.example.consumoapi.Retrofit

import com.example.consumoapi.service.EnderecoService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitFactory {
    val BASE_URL = "https://viacep.com.br/ws/"
    private val retrofitFactory = Retrofit
        .Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getEnderecoService(): EnderecoService{
        return retrofitFactory.create(EnderecoService::class.java)
    }
}