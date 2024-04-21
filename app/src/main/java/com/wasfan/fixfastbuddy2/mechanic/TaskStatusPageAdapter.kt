package com.wasfan.fixfastbuddy2.mechanic.AdapterClass

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.wasfan.fixfastbuddy2.mechanic.cancelled
import com.wasfan.fixfastbuddy2.mechanic.completed
import com.wasfan.fixfastbuddy2.mechanic.ongoing

class TaskStatusPageAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return if (position == 0) {
            ongoing()
        } else if (position == 1) {
            completed()
        } else {
            cancelled()
        }
    }
}