package com.mustafa.begin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var myEditText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myEditText = findViewById(R.id.mainEditText)
    }

    fun aktiviteDegistir(view:View){

        var mesaj = myEditText.text.toString()
        val intent = Intent(applicationContext, IkinciActivity::class.java)
        intent.putExtra("yollananVeri", mesaj)


        startActivity(intent)

    }
}