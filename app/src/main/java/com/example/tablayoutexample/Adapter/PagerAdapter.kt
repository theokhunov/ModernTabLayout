package com.example.tablayoutexample.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.tablayoutexample.Fragments.*

internal class PagerViewAdapter (fm:FragmentManager?):
FragmentPagerAdapter(fm!!)
{
    override fun getCount(): Int {
        return 5
    }

    override fun getItem(position: Int): Fragment {
      return when(position){

          0-> {
HomeFragment()


          }
          1-> {
SearchFragment()


          }


          2-> {
AddFragment()


          }
          3-> {
NotiFragment()


          }


 4-> {
PersonFragment()


          }
else -> HomeFragment()



      }
    }
}