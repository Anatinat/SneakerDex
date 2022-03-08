package com.example.sneakerdex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    val firstFragment=HomeFragment()
    val secondFragment=SecondFragment()
    val thirdFragment=ThirdFragment()

    setCurrentFragment(firstFragment)

    bottomNavigationView.setOnNavigationItemSelectedListener {
        when(it.itemId){
            R.id.home->setCurrentFragment(firstFragment)
            R.id.person->setCurrentFragment(secondFragment)
            R.id.settings->setCurrentFragment(thirdFragment)

        }
        true
    }

}