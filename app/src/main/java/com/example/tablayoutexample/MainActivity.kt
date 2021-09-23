package com.example.tablayoutexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.tablayoutexample.Adapter.PagerViewAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var mViewPager : ViewPager
    private lateinit var homeBtn : ImageButton
    private lateinit var searchBtn:ImageButton
    private lateinit var addBtn:ImageButton
    private lateinit var notificationBtn:ImageButton
    private lateinit var profile:ImageButton
    private lateinit var mPagerAdapter: PagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

mViewPager = findViewById(R.id.mViewPager)
homeBtn = findViewById(R.id.homeBtn)
searchBtn = findViewById(R.id.searchBtn)
addBtn = findViewById(R.id.addBtn)
notificationBtn = findViewById(R.id.notBtn)
profile = findViewById(R.id.personBtn)


        homeBtn.setOnClickListener {
            mViewPager.currentItem = 0

        }

        searchBtn.setOnClickListener {

            mViewPager.currentItem = 1

        }

        addBtn.setOnClickListener {
            mViewPager.currentItem = 2

        }

        notificationBtn.setOnClickListener {
            mViewPager.currentItem = 3

        }

        profile.setOnClickListener {
            mViewPager.currentItem = 4

        }



mPagerAdapter = PagerViewAdapter(supportFragmentManager)
mViewPager.adapter = mPagerAdapter
        mViewPager.offscreenPageLimit = 5

        mViewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {

            }

            override fun onPageSelected(position: Int) {
changingTabs(position)
            }


            override fun onPageScrollStateChanged(state: Int) {

            }


        })

        mViewPager.currentItem = 0
        homeBtn.setImageResource(R.drawable.ic_baseline_home_24)
    }

    private fun changingTabs(position: Int) {
        if (position == 0) {
            homeBtn.setImageResource(R.drawable.ic_baseline_home_24)
            searchBtn.setImageResource(R.drawable.ic_search_bl)
            addBtn.setImageResource(R.drawable.add_24_bl)
            notificationBtn.setImageResource(R.drawable.notification_bl)
            profile.setImageResource(R.drawable.person_bl)

        }

        if (position == 1) {
            homeBtn.setImageResource(R.drawable.ic_home_bl)
            searchBtn.setImageResource(R.drawable.ic_baseline_search_24)
            addBtn.setImageResource(R.drawable.add_24_bl)
            notificationBtn.setImageResource(R.drawable.notification_bl)
            profile.setImageResource(R.drawable.person_bl)


        }

        if (position == 2) {
            homeBtn.setImageResource(R.drawable.ic_home_bl)
            searchBtn.setImageResource(R.drawable.ic_search_bl)
            addBtn.setImageResource(R.drawable.ic_baseline_add_24)
            notificationBtn.setImageResource(R.drawable.notification_bl)
            profile.setImageResource(R.drawable.person_bl)


        }


        if (position == 3) {
            homeBtn.setImageResource(R.drawable.ic_home_bl)
            searchBtn.setImageResource(R.drawable.ic_search_bl)
            addBtn.setImageResource(R.drawable.add_24_bl)
            notificationBtn.setImageResource(R.drawable.ic_baseline_notifications_active_24)
            profile.setImageResource(R.drawable.person_bl)

        }
        if (position == 4) {
            homeBtn.setImageResource(R.drawable.ic_home_bl)
            searchBtn.setImageResource(R.drawable.ic_search_bl)
            addBtn.setImageResource(R.drawable.add_24_bl)
            notificationBtn.setImageResource(R.drawable.notification_bl)
            personBtn.setImageResource(R.drawable.ic_baseline_person_outline_24)


        }

    }
}