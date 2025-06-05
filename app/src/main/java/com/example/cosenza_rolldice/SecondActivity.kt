package com.example.cosenza_rolldice

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.textViewActivitySecond)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
       var msg = intent.getStringExtra("MESSAGE")

        var imageViewSecond = findViewById<ImageView>(R.id.imageViewActivitySecond)
        var random = intent.getIntExtra("RANDOM", -1)
        var resource = when (random){
            1 -> (R.drawable.dice_face_1)
            2 -> (R.drawable.dice_face_2)
            3 -> (R.drawable.dice_face_3)
            4 -> (R.drawable.dice_face_4)
            5 -> (R.drawable.dice_face_5)
            6 -> (R.drawable.dice_face_6)
            else -> {R.drawable.dices}
        }
        imageViewSecond.setImageResource(resource)
        Log.d("SECOND", "FINITO DISEGNO DEI DADI")

        val textView = findViewById<TextView>(R.id.textViewActivitySecond)
        textView.text = msg


        var buttonShowResult : Button = findViewById(R.id.buttonShowResult)
        buttonShowResult.setOnClickListener(View.OnClickListener {
            var toast = Toast.makeText(this, "Visulizza i risultati", Toast.LENGTH_LONG)
            toast.show()


        val buttonShowResult = findViewById<Button>(R.id.buttonShowResult)
        buttonShowResult.setOnClickListener {
            val intent: Intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("RANDOM", random)
            startActivity(intent)
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }

    
    //commento per vedere se ho risolto il problema del push
}