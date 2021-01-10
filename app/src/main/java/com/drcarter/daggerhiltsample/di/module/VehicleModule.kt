package com.drcarter.daggerhiltsample.di.module

import com.drcarter.daggerhiltsample.di.VEHICLE_BUS
import com.drcarter.daggerhiltsample.di.VEHICLE_TAXI
import com.drcarter.daggerhiltsample.model.Bus
import com.drcarter.daggerhiltsample.model.Taxi
import com.drcarter.daggerhiltsample.model.Vehicle
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class VehicleModule {

    @VEHICLE_BUS
    @Provides
    fun provideBus(): Vehicle {
        return Bus()
    }

    @VEHICLE_TAXI
    @Provides
    fun provideTaxi(): Vehicle {
        return Taxi()
    }

}