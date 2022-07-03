package com.mpfcoding.weatherappcompose.data.remote

import com.mpfcoding.weatherappcompose.data.remote.WeatherApi.ApiConstants.URL
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    @GET(URL)
    suspend fun getWeatherData(
        @Query("latitude") lat: Double,
        @Query("longitude") long: Double,
    ): WeatherDto

    object ApiConstants{
        const val URL = "v1/forecast?hourly=temperature_2m,weathercode,relativehumidity_2m,windspeed_10m,pressure_msl"
    }
}