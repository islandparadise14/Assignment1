package com.example.assignment1.koin.repositoryimpl

import android.annotation.SuppressLint
import com.example.assignment1.globalconst.UrlConst
import com.example.assignment1.globalconst.UrlConst.VERSION_INFO
import com.example.assignment1.utils.add
import com.example.assignment1.koin.repository.*
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class GuestRetrofitRepositoryImpl(private val okHttpRepo: GuestClientRepository):
    GuestRetrofitRepository {
    @SuppressLint("DefaultLocale")
    override fun getGuestRetrofit(): Retrofit {
        val client = okHttpRepo.getGuestOkHttp()
        val baseUrl: String = UrlConst.DEV_URL
        return Retrofit.Builder()
            .baseUrl(baseUrl add VERSION_INFO)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(client)
            .build()
    }
}
