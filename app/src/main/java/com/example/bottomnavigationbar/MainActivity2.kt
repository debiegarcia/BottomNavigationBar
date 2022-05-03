package com.example.bottomnavigationbar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity2 : AppCompatActivity() {
    private lateinit var navControllerPsycho: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val navHostFragment2 = supportFragmentManager.findFragmentById(R.id.mainContainer_2) as NavHostFragment
        navControllerPsycho = navHostFragment2.navController
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation_2)
        NavigationUI.setupWithNavController(bottomNavigationView, navControllerPsycho)

    }
}