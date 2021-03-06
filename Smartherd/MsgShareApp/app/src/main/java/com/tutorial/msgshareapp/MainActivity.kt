package com.tutorial.msgshareapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToask.setOnClickListener {
            Log.i("MainActivity","btn is clicked!")

            Toast.makeText(this,"btn is clicked!!",Toast.LENGTH_SHORT).show()
        }

        btnSendToSecondActivity.setOnClickListener{
            val massege: String = etToSecondActivity.text.toString()
            Toast.makeText(this,massege,Toast.LENGTH_SHORT).show()

            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
