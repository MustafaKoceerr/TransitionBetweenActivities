package com.mustafa.begin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ViewAnimator
import com.google.android.material.textview.MaterialTextView

class IkinciActivity : AppCompatActivity() {
    private lateinit var myText: MaterialTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ikinci)
        myText = findViewById(R.id.ikinciActivityText)

        val myIntent = intent
        var alinanVeri: String?
        alinanVeri = myIntent.getStringExtra("yollananVeri")
        myText.text = "Gonderdigin mesaj : $alinanVeri"


    }


    fun aktiviteDegistir(view: View){
        val intent = Intent(applicationContext, MainActivity::class.java)
        startActivity(intent)
    }
}