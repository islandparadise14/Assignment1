package com.example.assignment1.koin.repository

import okhttp3.OkHttpClient

interface GuestClientRepository {
    fun getGuestOkHttp(): OkHttpClient
}