package com.drcarter.daggerhiltsample.ui.main

import androidx.lifecycle.ViewModel
import com.drcarter.daggerhiltsample.di.VEHICLE_BUS
import com.drcarter.daggerhiltsample.di.VEHICLE_TAXI
import com.drcarter.daggerhiltsample.model.Vehicle
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    @VEHICLE_BUS private val bus: Vehicle,
    @VEHICLE_TAXI private val taxi: Vehicle
) : ViewModel() {

    fun increaseBusSpeed(speed: Int) {
        bus.increaseSpeed(speed)
    }

    fun currentBusSpeed(): Int {
        return bus.currentSpeed()
    }

    fun decreaseBusSpeed() {
        bus.decreaseSpeed(1)
    }


    fun increaseTaxiSpeed(speed: Int) {
        taxi.increaseSpeed(speed)
    }

    fun currentTaxiSpeed(): Int {
        return taxi.currentSpeed()
    }

    fun decreaseTaxiSpeed() {
        taxi.decreaseSpeed(2)
    }
}