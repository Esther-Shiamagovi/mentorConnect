package com.akirachix.mentorconnect

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.mentorconnect.databinding.ActivityMainBinding
import com.akirachix.mentorconnect.databinding.ActivitySecondBinding

class second_activity : AppCompatActivity() {
    lateinit var binding:ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView4.setOnClickListener {
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
            finish()}
            binding.button2.setOnClickListener {
                validateForm()
            }
    }
//    replace view id with viewbinding
    fun validateForm(){
        removeError()
        var formError = false
        val firstName= binding.etSecUsername.text.toString()
        if (firstName.isBlank()){
            formError = true
        }
        binding.tilSecUsername.error = "User name is required"
        val password= binding.etSecPassword.text.toString()
        if (password.isBlank()){
            formError = true
        }
        binding.tilSecPassword.error = "password is required"
    }
    fun removeError(){
        binding.tilSecUsername.error = null
        binding.tilSecPassword.error = null
    }
}
//        setContentView(R.layout.activity_second)
//        val connectRegister = findViewById<TextView>(R.id.textView4)
//        connectRegister.setOnClickListener {finish()
//        }