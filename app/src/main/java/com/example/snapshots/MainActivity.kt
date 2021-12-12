package com.example.snapshots

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.snapshots.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mBindign : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBindign = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBindign.root)

        setupBottomNav()
    }

    private fun setupBottomNav() {
        val fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().add(R.id.hostFragment, HomeFragment()).commit()
    }
}