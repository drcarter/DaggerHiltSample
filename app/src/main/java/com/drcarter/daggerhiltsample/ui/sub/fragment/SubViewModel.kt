package com.drcarter.daggerhiltsample.ui.sub.fragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.drcarter.daggerhiltsample.di.VEHICLE_BUS
import com.drcarter.daggerhiltsample.di.VEHICLE_TAXI
import com.drcarter.daggerhiltsample.model.Vehicle
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SubViewModel @Inject constructor(
    @VEHICLE_BUS private val bus: Vehicle,
    @VEHICLE_TAXI private val taxi: Vehicle
) : ViewModel() {

    val vehicleLiveData = MutableLiveData<Vehicle?>(null)

    fun selectVehicle(key: String) {
        when (key) {
            "bus" -> {
                vehicleLiveData.value = bus
            }
            "taxi" -> {
                vehicleLiveData.value = taxi
            }
        }
    }

}