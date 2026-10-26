package com.example.consumoapi.service

import com.example.consumoapi.model.Endereco
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

//interface -> Entre faces, facilita o acesso de uma engenharia de alto nivel para algo mais simples e visual
interface EnderecoService {
    //Metodo pertencente a biblioteca do retrofit2
    @GET("https://viacep.com.br/ws/{cep}/json/")
    fun getEnderecoByCep(@Path("cep") cep: String): Call<Endereco> //Esse call é um retorno da biblioteca do retrofit, fornecemos como parametro a nossa classe endereco
    @GET("https://viacep.com.br/ws/{uf}/{cidade}/{rua}/json/")
    fun getEnderecoByUfCidadeRua(
        @Path("uf")     uf: String,
        @Path("cidade") cidade: String,
        @Path("rua")    rua: String
    ): Call<List<Endereco>>
}