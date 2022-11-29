package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNameInput: EditText = findViewById(R.id.etNameInput)
        val btnContinue: Button = findViewById(R.id.btnContinue)
        btnContinue.setOnClickListener {
            if(etNameInput.text.isEmpty()){
                Toast.makeText(this, "Please enter a name!", Toast.LENGTH_LONG).show()
            }else{
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME, etNameInput.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}