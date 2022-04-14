package com.vina.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity(), View.OnClickListener {

    //val ivCompassIcon = findViewById<ImageView>(R.id.ivCompassIcon)
    private lateinit var ivCompass : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ivCompass = findViewById(R.id.ivCompassIcon)
        ivCompass.setOnClickListener(this)
    }

     override fun onClick(v: View?) {
         if (v != null) {
             when (v.id) {
                 R.id.ivCompassIcon -> run {
                     val intentBiasa = Intent(this@MainActivity, SecondActivity::class.java)
                     startActivity(intentBiasa)
                 }
             }
         }
     }
}