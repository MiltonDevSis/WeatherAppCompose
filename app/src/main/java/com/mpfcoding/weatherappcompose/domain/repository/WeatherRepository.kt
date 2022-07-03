package com.mpfcoding.weatherappcompose.domain.repository

import com.mpfcoding.weatherappcompose.domain.util.Resource
import com.mpfcoding.weatherappcompose.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(latitude: Double, longitude: Double): Resource<WeatherInfo>
}