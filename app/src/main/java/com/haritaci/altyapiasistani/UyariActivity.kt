package com.haritaci.altyapiasistani
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.haritaci.altyapiasistani.databinding.ActivityUyariBinding

class UyariActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUyariBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uyari)
        binding = ActivityUyariBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.butonKapat.setOnClickListener {
            val intent = Intent(this@UyariActivity,MainActivity::class.java)
            startActivity(intent)
            }
        }

    }

