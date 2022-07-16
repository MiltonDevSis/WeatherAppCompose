package com.mpfcoding.weatherappcompose.presentation

import com.mpfcoding.weatherappcompose.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)