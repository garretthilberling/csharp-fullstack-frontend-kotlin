package com.hilberling.treblleapp.data

import retrofit2.http.Body
import retrofit2.http.POST

interface AuthenticationService {
    // Create an account
    @POST("${Api.API_PATH}Account/Register")
    suspend fun registerUser(@Body registerUser: RegisterUser)
}