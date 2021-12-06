package com.example.abbyyandroidhomeworkproject

import android.animation.Animator
import android.animation.AnimatorInflater
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.animation.addListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun getDescription(view: View) {
        val intent = Intent(this, Description::class.java)
        val card:View = findViewById(R.id.hzd_card)
        val animator: Animator = AnimatorInflater.loadAnimator(this, R.animator.card_animation)
            .apply {
                setTarget(card)
                addListener({startActivity(intent)})
                start()
            }

    }
}