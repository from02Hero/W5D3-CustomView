package com.example.customview.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.customview.R
import kotlinx.android.synthetic.main.activity_face.*

class FaceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_face)

        happyButton.setOnClickListener {
            emotionalFaceView.happinessState = EmotionalFaceView.HAPPY
        }

        sadButton.setOnClickListener {
            emotionalFaceView.happinessState = EmotionalFaceView.SAD
        }
    }
}
