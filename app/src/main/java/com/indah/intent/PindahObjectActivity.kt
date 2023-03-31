package com.yr.belajarintent

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class PindahObjectActivity : AppCompatActivity() {

    private lateinit var tvPenerimaObjek : TextView

    companion object {
        const val EXTRA_CARS = "extra cars"
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pindah_object)

        tvPenerimaObjek = findViewById(R.id.tv_penerima_objek)

        val Cars: cars = intent.getParcelableExtra<cars>(EXTRA_CARS) as cars
        val text = "Merk : ${Cars.merk.toString()} \nTahun: ${Cars.tahun.toString()} \nPlat: ${Cars.plat.toString()}"
        tvPenerimaObjek.text = text

    }
}