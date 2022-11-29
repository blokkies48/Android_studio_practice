package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    private var playerName: TextView? = null
    private var score: TextView? = null
    private var btnFinish: Button? = null

    private var userName: String? = null
    private var correctAnswers: String? = null
    private var totalQuestions: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        userName = intent.getStringExtra(Constants.USER_NAME)
        correctAnswers = intent.getStringExtra(Constants.CORRECT_ANSWERS)
        totalQuestions = intent.getStringExtra(Constants.TOTAL_QUESTIONS)

        playerName = findViewById(R.id.tv_player_name)
        score = findViewById(R.id.tv_score)
        btnFinish = findViewById(R.id.btn_finish)

        playerName?.text = userName
        score?.text = "You got $correctAnswers/$totalQuestions correct!"

        btnFinish?.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}