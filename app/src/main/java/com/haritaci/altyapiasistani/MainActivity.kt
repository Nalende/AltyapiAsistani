package com.haritaci.altyapiasistani

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.haritaci.altyapiasistani.databinding.ActivityMainBinding

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
                var Aletkotu = binding.CihazKotu.text.toString().toDouble()
                var baca1 = binding.baca1Kotu.text.toString().toDouble()
                var baca2 = binding.baca2Kotu.text.toString().toDouble()
                var bacamesafe = binding.bacaMesafe.text.toString().toDouble()
                var nerdesin =binding.cursor.text.toString().toDouble()
                var borucap = binding.boruCapi.text.toString().toDouble()
                var bUstu:Double =  (((Aletkotu - (baca1 - (((baca1 - baca2)/bacamesafe)*nerdesin))) - borucap)).toDouble()
                var bAlti:Double =  (Aletkotu - (baca1 - (((baca1 - baca2)/bacamesafe)*nerdesin))).toDouble()
                bAlti = Math.floor(bAlti * 100) / 100;
                bUstu = Math.floor(bUstu * 100) / 100;

                binding.kaziUst.text = bAlti.toString()
                binding.boruUst.text = bUstu.toString()

            }


            else binding.uyari.text = "HATA!"
            binding.uyari.setTextColor(getColor(R.color.red))
        }
}
}