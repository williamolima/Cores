package com.example.cores

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {
    private lateinit var mudarCor: TextView
    private lateinit var fundo: View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.mudarCor = findViewById(R.id.cores)
        fundo = findViewById(R.id.fundoPrincipal)

        this.mudarCor.setOnClickListener { onClickMudar(fundo) }

    }
    private fun onClickMudar(view: View){
        val rnd = Random()
        var color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        view.setBackgroundColor(color);
    }
}