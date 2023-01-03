package com.example.gitrepitition

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gitrepitition.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //commit  o`zgarishlarni belgilab olish
        //push -> o`zgarishlarni yuklash
        //pull -> o`zgarishlarni qabul qilish

    }
}