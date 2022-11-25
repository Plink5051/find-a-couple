package com.example.memorygame

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class InitialWindow : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.initial_window)

    }
    fun playGame(view: View){
        val intent:Intent= Intent(this@InitialWindow,MainActivity::class.java)
        startActivity(intent)


    }
}