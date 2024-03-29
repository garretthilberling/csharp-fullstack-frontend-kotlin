package com.hilberling.treblleapp.data

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object Api {

    private val BASE_URL = "https://treblleapp.azurewebsites.net/"

    const val API_PATH = "api/"
    // set up moshi object
    private val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

    private val logging = HttpLoggingInterceptor()

    private val httpClient = OkHttpClient.Builder().apply {
        logging.level = HttpLoggingInterceptor.Level.BODY
        addNetworkInterceptor(logging)
    }.build()

    private val retrofit = Retrofit.Builder()
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .baseUrl(BASE_URL)
        .client(httpClient)
        .build()

    val authService : AuthenticationService by lazy {
        retrofit.create(AuthenticationService::class.java)
    }
}