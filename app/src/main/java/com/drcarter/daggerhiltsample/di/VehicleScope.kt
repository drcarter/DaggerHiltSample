package com.drcarter.daggerhiltsample.di

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class VEHICLE_BUS

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class VEHICLE_TAXI