package com.mpfcoding.weatherappcompose.domain.location

import android.location.Location

interface LocationTracker {
    suspend fun getCurrentLocation(): Location? // teste
}