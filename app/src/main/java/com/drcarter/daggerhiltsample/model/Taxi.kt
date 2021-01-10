package com.drcarter.daggerhiltsample.model

class Taxi : Vehicle {

    private var speed: Int = 0

    override fun increaseSpeed(value: Int) {
        this.speed += value
    }

    override fun decreaseSpeed(value: Int) {
        this.speed -= value

        if (this.speed <= 0) {
            this.speed = 0
        }
    }

    override fun currentSpeed(): Int = this.speed

    override fun name(): String {
        return "Taxi"
    }

}