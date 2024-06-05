package com.akirachix.mentorconnect

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import com.akirachix.mentorconnect.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView2.setOnClickListener {
            val intent =Intent(this,second_activity::class.java)
            startActivity(intent)
        }
        binding.button.setOnClickListener {
            validateRegistration()
        }

    }
    fun validateRegistration(){
        clearErrors()
        var formError = false
        val firstName= binding.etFirstName.text.toString()
        if (firstName.isBlank()){
            formError = true
        }
        binding.tilFirstName.error = getString(R.string.first_name_is_required)
        val lastName= binding.etLastName.text.toString()
        if(lastName.isBlank()){
            formError= true
            binding.tilLastName.error = getString(R.string.last_name_is_required)
        }
        val email = binding.etEmail.text.toString()
        if (email.isBlank()) {
            formError = true
            binding.tilEmail.error = getString(R.string.email_is_required)
        }
        val codehiveId = binding.etCodehiveId.text.toString()
        if (email.isBlank()) {
            formError = true
            binding.tilCodehiveId.error = getString(R.string.codehiveid_is_required)
        }
            val userName = binding.etUserName.text.toString()
        if (userName.isBlank()) {
            formError = true
            binding.tilUserName.error = getString(R.string.username_is_required)
        }
        val password = binding.etPassword.text.toString()
        if (password.isBlank()) {
            formError = true
            binding.tilUserName.error = getString(R.string.password_is_required)
        }
        val confirmpassword = binding.etCon.text.toString()
        if (confirmpassword.isBlank()) {
            formError = true
            binding.tilConfirmPassword.error = "password is required"
        }
        if (password!=confirmpassword) {
            formError = true
            binding.tilConfirmPassword.error =
                getString(R.string.password_and_confirmation_do_not_match)
        }
        if(formError){
            formError = true
        }

    }
    fun clearErrors(){
        binding.tilFirstName.error = null
        binding.tilLastName.error = null
        binding.tilEmail.error = null
        binding.tilCodehiveId.error = null
        binding.tilUserName.error = null
        binding.tilPassword.error = null
        binding.tilConfirmPassword.error = null
    }
}

//        setContentView(R.layout.activity_main)
//        val connectRegister=findViewById<TextView>(R.id.textView2)
//        connectRegister.setOnClickListener {
//            val intent = Intent( this,second_activity::class.java)
//            startActivity(intent)
//        }