package com.mpfcoding.weatherappcompose.data.repository

import android.os.Build
import androidx.annotation.RequiresApi
import com.mpfcoding.weatherappcompose.data.mappers.toWeatherInfo
import com.mpfcoding.weatherappcompose.data.remote.WeatherApi
import com.mpfcoding.weatherappcompose.domain.repository.WeatherRepository
import com.mpfcoding.weatherappcompose.domain.util.Resource
import com.mpfcoding.weatherappcompose.domain.weather.WeatherInfo
import java.lang.Exception
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
): WeatherRepository {

    @RequiresApi(Build.VERSION_CODES.O)
    override suspend fun getWeatherData(
        latitude: Double,
        longitude: Double
    ): Resource<WeatherInfo> {
        return try {
            return Resource.Success(
                data = api.getWeatherData(
                    lat = latitude,
                    long = longitude
                ).toWeatherInfo()
            )
        }catch (e: Exception){
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }
}