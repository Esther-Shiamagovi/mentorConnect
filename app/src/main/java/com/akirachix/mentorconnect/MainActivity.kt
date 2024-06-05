package com.akirachix.mentorconnect

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val connectRegister=findViewById<TextView>(R.id.textView2)
        connectRegister.setOnClickListener {
            val intent = Intent( this,second_activity::class.java)
            startActivity(intent)
        }

    }

}
