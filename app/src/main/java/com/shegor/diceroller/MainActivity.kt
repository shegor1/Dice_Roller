package com.shegor.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shegor.diceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        binding.result.text = "5"
        setContentView(binding.root)

    }
}