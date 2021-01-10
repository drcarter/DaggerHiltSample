package com.drcarter.daggerhiltsample.ui.sub

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.drcarter.daggerhiltsample.R
import com.drcarter.daggerhiltsample.databinding.ActivitySubBinding
import com.drcarter.daggerhiltsample.ui.BaseActivity
import com.drcarter.daggerhiltsample.ui.sub.fragment.SubFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SubActivity : BaseActivity<ActivitySubBinding>() {

    override fun contentViewLayout(): Int = R.layout.activity_sub

    override fun initBinding(binding: ActivitySubBinding) {
        binding.run {
            with(viewpager) {
                adapter = SubAdapter(supportFragmentManager, lifecycle)
            }
        }
    }

    override fun initViewModel() {
    }
}

class SubAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                SubFragment.newInstance("taxi")
            }
            1 -> {
                SubFragment.newInstance("bus")
            }
            else -> {
                SubFragment.newInstance("taxi")
            }
        }
    }

}