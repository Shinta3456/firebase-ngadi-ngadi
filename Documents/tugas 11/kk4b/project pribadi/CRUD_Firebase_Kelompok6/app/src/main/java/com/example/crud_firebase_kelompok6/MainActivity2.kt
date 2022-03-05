package com.example.crud_firebase_kelompok6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {

    lateinit var ref: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        ref = FirebaseDatabase.getInstance().getReference("USERS")

        btn_save.setOnClickListener {
            savedata()
            val intent = Intent (this, MainActivity2::class.java)
            startActivity(intent)
        }
    }

    private fun savedata() {
        val nama = edit1.text.toString()
        val status = edit2.text.toString()

        val userId = ref.push().key.toString()
        val user = Users(userId, nama, status)


        ref.child(userId).setValue(user).addOnCompleteListener {
            Toast.makeText(this, "Successs", Toast.LENGTH_SHORT).show()
            edit1.setText("")
            edit2.setText("")

        }
    }
}