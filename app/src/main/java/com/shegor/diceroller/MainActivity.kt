package com.shegor.diceroller
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shegor.diceroller.databinding.ActivityMainBinding
import java.lang.Exception
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.bind(findViewById(R.id.root_layout))

        binding.rollButton.setOnClickListener {
            rollDice()
        }
    }
    fun rollDice(){
        val randomNumber = (Random.nextInt(6) + 1)
        var drawable_resourse = when (randomNumber){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> throw Exception()
        }
        binding.diceImage.setImageResource(drawable_resourse)
    }
}