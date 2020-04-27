package com.example.assignment1.koin.repository

import retrofit2.Retrofit

interface GuestRetrofitRepository {
    fun getGuestRetrofit(): Retrofit
}