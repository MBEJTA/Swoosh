package com.example.android.swoosh

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // launch next activity
        getStartedButton.setOnClickListener() {
            // intent is a object that lets you interact with other applications, as well as your own
            // example = intent (action) open camera app and take a picture / navigate to another activity. (implicit / explicit intents)

            val leagueIntent = Intent (this, SecondActivity::class.java)
            startActivity(leagueIntent)

        }
    }
}
