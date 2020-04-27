package com.example.assignment1.api.service

import com.example.assignment1.data.response.UserInfoResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface githubService {
    @GET("users/{username}")
    fun getUserInfo(@Path("username") username: String): Single<UserInfoResponse>

    @GET("users/{username}/repos")
    fun getUserRepos(@Path("username") username: String): Single<ArrayList<>>
}