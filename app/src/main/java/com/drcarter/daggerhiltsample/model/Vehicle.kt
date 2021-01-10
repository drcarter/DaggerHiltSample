package com.drcarter.daggerhiltsample.model

interface Vehicle {

    fun increaseSpeed(value: Int)

    fun decreaseSpeed(value: Int)

    fun currentSpeed(): Int

    fun name(): String
}