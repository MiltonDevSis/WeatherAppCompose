package com.mpfcoding.weatherappcompose.domain.weather

import com.mpfcoding.weatherappcompose.data.remote.WeatherDataDto

data class WeatherInfo(
    val weatherDataPerDay: Map<Int, List<WeatherData>>,
    val currentWeatherData: WeatherData?
)