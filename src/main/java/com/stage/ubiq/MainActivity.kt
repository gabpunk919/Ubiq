package com.stage.ubiq

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.R
import com.stage.ubiq.databinding.ActivityMainBinding
import com.stage.ubiq.databinding.FragmentAccueilBinding


class MainActivity : AppCompatActivity() {
    private lateinit var vue: FragmentAccueilBinding
    private lateinit var vue2: ActivityMainBinding
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vue = FragmentAccueilBinding.inflate(layoutInflater)

        setContentView(vue.root)

    }

}