package com.shegor.diceroller
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.shegor.diceroller.databinding.ActivityMainBinding
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.bind(findViewById(R.id.root_layout))
        binding.rollButton.setOnClickListener {
            Toast.makeText(this, "", Toast.LENGTH_SHORT)
            rollDice()
        }
    }
    fun rollDice(){
        binding.resultTextView.text = (Random.nextInt(6) + 1).toString()
    }

}