package com.example.myactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var LOG_TAG = "MYLOG"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(LOG_TAG, "Tomorrow you'll")
    }

    override fun onStart() {
        super.onStart()
        Log.d(LOG_TAG, "Regret by thinking of a day,")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(LOG_TAG, "onRestart() called")

    }

    override fun onResume() {
        super.onResume()
        Log.d(LOG_TAG, "That never comes.")

    }

    override fun onPause() {
        super.onPause()
        Log.d(LOG_TAG, "onPause() called")

    }

    override fun onStop() {
        super.onStop()
        Log.d(LOG_TAG, "onStop() called")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(LOG_TAG, "onDestroy() called")

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(LOG_TAG, "onSaveInstanceState() called")

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(LOG_TAG, "onRestoreInstanceState() called")

    }
}


