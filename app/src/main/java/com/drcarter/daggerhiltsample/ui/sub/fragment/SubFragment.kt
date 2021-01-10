package com.drcarter.daggerhiltsample.ui.sub.fragment

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.drcarter.daggerhiltsample.R
import com.drcarter.daggerhiltsample.databinding.FragmentSubBinding
import com.drcarter.daggerhiltsample.ui.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SubFragment : BaseFragment<FragmentSubBinding>() {

    private val viewModel by viewModels<SubViewModel>()

    override fun getLayoutId(): Int = R.layout.fragment_sub

    override fun initViewDataBinding() {
        binding.run {
            viewModel = this@SubFragment.viewModel
        }
    }

    override fun initViewModel() {
        viewModel.selectVehicle(arguments?.getString("key") ?: "taxi")
    }

    companion object {
        fun newInstance(key: String): SubFragment {
            return SubFragment().apply {
                arguments = Bundle().apply {
                    putString("key", key)
                }
            }
        }
    }
}