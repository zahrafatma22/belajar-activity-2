package com.example.belajaractivity2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.belajaractivity2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.btnKirim.setOnClickListener {
            sendMessage()
        }
        setContentView(binding.root)
//        setContentView(R.layout.activity_main)
    }

    override fun onRestart() {
        super.onRestart()
        binding.etName.setText("")
        binding.etEmail.setText("")
        binding.etAlamat.setText("")
        binding.etHp.setText("")
        Log.d("lifecycle","OnRestart dimulai")
    }

    fun sendMessage(){
        val nama = binding.etName.text.toString()
        val email = binding.etEmail.text.toString()
        val alamat = binding.etAlamat.text.toString()
        val hp = binding.etHp.text.toString()
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("nama", nama)
        intent.putExtra("email", email)
        intent.putExtra("alamat", alamat)
        intent.putExtra("hp", hp)
        startActivity(intent)
    }
}