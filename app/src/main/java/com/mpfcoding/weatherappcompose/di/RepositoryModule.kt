package com.mpfcoding.weatherappcompose.di

import com.mpfcoding.weatherappcompose.data.location.DefaultLocationTracker
import com.mpfcoding.weatherappcompose.data.repository.WeatherRepositoryImpl
import com.mpfcoding.weatherappcompose.domain.location.LocationTracker
import com.mpfcoding.weatherappcompose.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindWeatherRepository(
        weatherRepositoryImpl: WeatherRepositoryImpl
    ): WeatherRepository
}