package com.qhy040404.tapcounter

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text: TextView = findViewById(R.id.textView)
        val b1: Button = findViewById(R.id.button)
        val b2: Button = findViewById(R.id.button2)
        val refresh: Button = findViewById(R.id.button3)

        var osz = 0
        var tfz = 0

        b1.setOnClickListener {
            osz++
            text.text = refreshText(osz, tfz)
        }
        b2.setOnClickListener {
            tfz++
            text.text = refreshText(osz, tfz)
        }
        refresh.setOnClickListener {
            osz = 0
            tfz = 0
            text.text = refreshText(osz, tfz)
        }
    }

    private fun refreshText(a: Int, b: Int): String {
        return "160: $a\n240: $b"
    }
}