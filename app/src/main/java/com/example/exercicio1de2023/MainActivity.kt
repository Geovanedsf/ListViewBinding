package com.example.exercicio1de2023

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.exercicio1de2023.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewBinding()

        changeText()

        val textView = findViewById<TextView>(R.id.TextView1)
        val button = findViewById<Button>(R.id.button1)


    }

    private fun viewBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    private fun changeText() {
        val listagem = listOf("João", "Ricardo", "Rafael", "Maria", "Aline")
        var itemIndex = 0

        binding.button1.setOnClickListener{
            if (itemIndex >= listagem.size) {
                itemIndex = 0
            }
            binding.TextView1.text = listagem[itemIndex]
            itemIndex++
        }
    }
}

