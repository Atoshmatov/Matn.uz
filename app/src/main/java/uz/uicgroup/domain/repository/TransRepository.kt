package uz.uicgroup.domain.repository

import retrofit2.Response
import uz.uicgroup.data.remote.request.LatinRequest

interface TransRepository {
    //to turn to Latin
    suspend fun transLatin(text: LatinRequest): Response<String>
    //to turn to Cyril
    suspend fun transCyrillic(text: LatinRequest): Response<String>
}