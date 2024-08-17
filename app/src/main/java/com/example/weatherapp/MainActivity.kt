package com.example.weatherapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.weatherapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val anim_slow = AnimationUtils.loadAnimation(this, R.anim.translate_slow)
        binding.cloud.startAnimation(anim_slow)
        val anim_normal = AnimationUtils.loadAnimation(this, R.anim.translate_normal)
        binding.cloudFirst.startAnimation(anim_normal)
        setContentView(binding.root)
    }

    fun addpage(view: View) {
        val intent=Intent(this,SecondActivity::class.java)
        startActivity(intent)
    }
}
