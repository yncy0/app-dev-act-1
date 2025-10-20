package com.example.buttoncolorchange

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val mainLayout = findViewById<LinearLayout>(R.id.main)

        val buttonRed = findViewById<Button>(R.id.button_red)
        val buttonOrange = findViewById<Button>(R.id.button_orange)
        val buttonYellow = findViewById<Button>(R.id.button_yellow)
        val buttonGreen = findViewById<Button>(R.id.button_green)
        val buttonBlue = findViewById<Button>(R.id.button_blue)
        val buttonViolet = findViewById<Button>(R.id.button_violet)

        buttonRed.setOnClickListener {
            mainLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_red))
        }

        buttonOrange.setOnClickListener {
            mainLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_orange))
        }

        buttonYellow.setOnClickListener {
            mainLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_yellow))
        }

        buttonGreen.setOnClickListener {
            mainLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_green))
        }

        buttonBlue.setOnClickListener {
            mainLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_blue))
        }

        buttonViolet.setOnClickListener {
            mainLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.bg_violet))
        }
    }
}