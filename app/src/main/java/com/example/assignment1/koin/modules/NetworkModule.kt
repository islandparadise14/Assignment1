package com.example.assignment1.koin.modules

import com.example.assignment1.koin.repository.*
import com.example.assignment1.koin.repositoryimpl.*
import org.koin.dsl.module

val networkModule = module {
    single<GuestClientRepository> { GuestClientRepositoryImpl() }

    single<GuestRetrofitRepository> { GuestRetrofitRepositoryImpl(get()) }
}