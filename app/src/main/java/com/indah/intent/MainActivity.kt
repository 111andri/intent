package com.yr.belajarintent

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.yr.belajarintent.R.id.btn_pindah_data

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnPindah: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPindah = findViewById(R.id.btn_pindah)
        val btnIntentData = findViewById<Button>(btn_pindah_data)
        val btnIntentObjek = findViewById<Button>(R.id.btn_pindah_object)

        btnPindah.setOnClickListener(this)
        btnIntentData.setOnClickListener(this)
        btnIntentObjek.setOnClickListener(this)

    }

    override fun onClick(p0: View) {
        when(p0.id) {
            R.id.btn_pindah -> run{
                val intentBiasa = Intent(this@MainActivity, PindahActivity::class.java)
                startActivity(intentBiasa)
            }

            R.id.btn_pindah_data -> run{
                val intenData = Intent(this@MainActivity, PindahDataActivity::class.java)
                intenData.putExtra(PindahDataActivity.EXTRA_TEXT,  "Hy,Ayo belajar android studio")
                startActivity(intenData)
            }
            R.id.btn_pindah_object -> run {
                val Cars = cars (
                            merk = "Toyota",
                            tahun = 2020,
                            plat = "BM 2020 SAR"
                        )
                val intentObjek = Intent(this@MainActivity, PindahObjectActivity::class.java)
                intentObjek.putExtra(PindahObjectActivity.EXTRA_CARS, Cars)
                startActivity(intentObjek)
            }
        }
    }
}