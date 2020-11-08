package com.example.recycleviewex.Adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.ListFragment
import com.example.recycleviewex.Fragments.BebidasFragment
import com.example.recycleviewex.Fragments.SalgadoFragment

class FragmentViewPagerAdapter (ctx: Context, fm: FragmentManager): FragmentPagerAdapter(fm,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {


    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0 -> return "Salgados"
            else -> return "Bebidas"
        }
    }

    override fun getItem(position: Int): Fragment {
       when(position){
           0 -> return SalgadoFragment()
           else -> return BebidasFragment()
       }
    }

    override fun getCount(): Int {
       return 2
    }
}
