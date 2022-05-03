package com.example.bottomnavigationbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.bottomnavigationbar.fragments.AccountFragment
import com.example.bottomnavigationbar.fragments.DatesFragment
import com.example.bottomnavigationbar.fragments.HomeFragment
import com.example.bottomnavigationbar.fragments.PsychologistsFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarItemView
import com.google.android.material.navigation.NavigationBarView

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val isPatient = false

        if(isPatient) {
            val navHostFragment = supportFragmentManager.findFragmentById(R.id.mainContainer) as NavHostFragment
            navController = navHostFragment.navController
            val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
            setupWithNavController(bottomNavigationView, navController)
        }
        else{
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

    }

}