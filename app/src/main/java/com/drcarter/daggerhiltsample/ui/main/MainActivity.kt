package com.drcarter.daggerhiltsample.ui.main

import android.content.Intent
import androidx.activity.viewModels
import com.drcarter.daggerhiltsample.R
import com.drcarter.daggerhiltsample.databinding.ActivityMainBinding
import com.drcarter.daggerhiltsample.ui.BaseActivity
import com.drcarter.daggerhiltsample.ui.sub.SubActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {

    private val mainViewModel by viewModels<MainViewModel>()

    override fun contentViewLayout(): Int = R.layout.activity_main

    override fun initBinding(binding: ActivityMainBinding) {
        binding.run {
            buttonBusSpeedIncrease.setOnClickListener {
                mainViewModel.increaseBusSpeed(5)

                textBusSpeed.text = "bus speed : " + mainViewModel.currentBusSpeed()
            }
            buttonBusSpeedDecrease.setOnClickListener {
                mainViewModel.decreaseBusSpeed()

                textBusSpeed.text = "bus speed : " + mainViewModel.currentBusSpeed()
            }

            buttonTaxiSpeedIncrease.setOnClickListener {
                mainViewModel.increaseTaxiSpeed(10)
                textTaxiSpeed.text = "taxi speed : " + mainViewModel.currentTaxiSpeed()
            }
            buttonTaxiSpeedDecrease.setOnClickListener {
                mainViewModel.decreaseTaxiSpeed()
                textTaxiSpeed.text = "taxi speed : " + mainViewModel.currentTaxiSpeed()
            }

            buttonSub.setOnClickListener {
                Intent(this@MainActivity, SubActivity::class.java).run {
                    startActivity(this)
                }
            }
        }
    }

    override fun initViewModel() {
    }
}