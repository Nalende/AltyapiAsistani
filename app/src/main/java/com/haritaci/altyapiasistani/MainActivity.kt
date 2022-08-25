package com.haritaci.altyapiasistani

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.haritaci.altyapiasistani.databinding.ActivityMainBinding
import kotlin.math.round

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



        binding.hesapButton.setOnClickListener{
            if (binding.CihazKotu.text.isNotEmpty()&&binding.baca1Kotu.text.isNotEmpty()&&binding.baca2Kotu.text.isNotEmpty()&&binding.bacaMesafe.text.isNotEmpty()&&binding.cursor.text.isNotEmpty()&&binding.boruCapi.text.isNotEmpty()) {
                binding.uyari.text = null
                val aletkotu = binding.CihazKotu.text.toString().toDouble()
                val baca1 = binding.baca1Kotu.text.toString().toDouble()
                val baca2 = binding.baca2Kotu.text.toString().toDouble()
                val bacamesafe = binding.bacaMesafe.text.toString().toDouble()
                val nerdesin =binding.cursor.text.toString().toDouble()
                val borucap = binding.boruCapi.text.toString().toDouble()
                var bUstu:Double = (((aletkotu - (baca1 - (((baca1 - baca2)/bacamesafe)*nerdesin))) - borucap))
                var bAlti:Double = (aletkotu - (baca1 - (((baca1 - baca2)/bacamesafe)*nerdesin)))
                bAlti = round(bAlti * 100) / 100
                bUstu = round(bUstu * 100) / 100


                binding.kaziUst.text = bAlti.toString()
                binding.boruUst.text = bUstu.toString()

            }


            else
                "HATA!".also { binding.uyari.text = it }
                binding.uyari.setTextColor(getColor(R.color.red))
        }
}
}