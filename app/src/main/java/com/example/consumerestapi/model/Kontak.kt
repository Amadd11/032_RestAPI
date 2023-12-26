package com.example.consumerestapi.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Kontak(
    val id: Int,
    @SerialName("nama")
    val nama: String,
    @SerialName("email")
    val email: String,
    @SerialName("nohp")
    val nohp: String,
)
