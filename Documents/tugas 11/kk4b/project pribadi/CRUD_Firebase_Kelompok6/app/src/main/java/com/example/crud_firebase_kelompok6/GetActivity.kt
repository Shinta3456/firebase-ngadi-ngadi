package com.example.crud_firebase_kelompok6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_get.*

class GetActivity : AppCompatActivity() {
    private lateinit var btn1get: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get)

        btn1get = findViewById(R.id.btn1get)
        btn1get.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}