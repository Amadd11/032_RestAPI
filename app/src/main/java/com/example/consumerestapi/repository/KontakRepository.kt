package com.example.consumerestapi.repository

import com.example.consumerestapi.model.Kontak
import com.example.consumerestapi.service_api.KontakService

interface KontakRepository {
    suspend fun getKontak(): List<Kontak>
    suspend fun deleteKontak(id: Int): Boolean

}

class NetworkKontakRepository(
    private val kontakApiService: KontakService
) : KontakRepository {

    override suspend fun getKontak(): List<Kontak> = kontakApiService.getKontak()

    override suspend fun deleteKontak(id: Int): Boolean {
        // Implementasi penghapusan kontak melalui kontakApiService dengan menggunakan id
        val response = kontakApiService.deleteKontak(id)

        // Mengembalikan nilai true jika penghapusan berhasil, false sebaliknya
        return response.isSuccessful
    }
}