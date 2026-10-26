package com.example.consumoapi.model

import com.google.gson.annotations.SerializedName

//O data tem como utilidade padronizar a utilizacao da class
data class Endereco (
    val cep: String = "",
    //Funcao pertencente a biblioteca do google, responsavel por permitir a utlizacao de outras nomenclaturas no projeto referente aos dados da API
    @SerializedName("logradouro")
    val rua: String = "",
    @SerializedName("localidade")
    val cidade: String = "",
    val bairro: String = "",
    val uf: String = "",
)