package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class SignInActivity : AppCompatActivity() {
    lateinit var Email: EditText
    lateinit var Password: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        Email = findViewById(R.id.editTextTextEmailAddress)
        Password = findViewById(R.id.editTextTextPassword)
    }

    fun signin(view: View) {
        if (Email.text.isNotEmpty() && Password.text.isNotEmpty()){
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
        else
        {
            val Alter = AlertDialog.Builder(this)
                .setTitle("Error")
                .setMessage("You have not entered an email or password")
                .setPositiveButton("Ok", null)
                .create()
                .show()
        }
    }
}