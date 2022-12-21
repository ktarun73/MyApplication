package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn=findViewById<Button>(R.id.button)

        val text=findViewById<TextView>(R.id.textView)

        btn.setOnClickListener {

            text.text="Button Clicked"
            Toast.makeText(this, "toast", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onPause() {
        super.onPause()
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "toast", Toast.LENGTH_SHORT).show()

    }

    override fun onStop() {
        super.onStop()
        setContentView(R.layout.activity_main)
    }
}