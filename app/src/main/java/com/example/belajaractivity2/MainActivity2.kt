package com.example.belajaractivity2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.belajaractivity2.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
//        setContentView(R.layout.activity_main2)
        val nama2 = intent.getStringExtra("nama")
        val email2 = intent.getStringExtra("email")
        val alamat2 = intent.getStringExtra("alamat")
        val hp2 = intent.getStringExtra("hp")

        binding.tvHslnma.text =  "Nama          :${nama2.toString()}"
        binding.tvHsleml.text =  "Email         :${email2.toString()}"
        binding.tvHslalmt.text = "Alamat        :${alamat2.toString()}"
        binding.tvHslhp.text =   "No.HandPhone  :${hp2.toString()}"
        setContentView(binding.root)
    }
}