package com.example.cosenza_rolldice

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.textViewResult)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val numero = intent.getIntExtra("RANDOM", -1)
        val textViewResult = findViewById<TextView>(R.id.textViewResult)

        if (numero != -1) {
            val messaggio = if (numero % 2 == 0) {
                "Hai vinto! Il numero $numero è pari "
            } else {
                "Hai perso! Il numero $numero è dispari "
            }
            textViewResult.text = messaggio
        } else {
            textViewResult.text = "Errore nel recupero del numero."
        }

        val buttonGoHome = findViewById<Button>(R.id.buttonGoHome)
        buttonGoHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            finish()
        }
    }
}
