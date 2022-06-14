package com.example.codingtest2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.example.codingtest2.databinding.ActivityMainBinding
import com.example.codingtest2.ui.MainAdapter
import com.example.codingtest2.ui.MainViewModel

class MainActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main3)
    }
    fun gotoNextPage(v: View){
        val intent = Intent(this@MainActivity3,MainActivity::class.java)
        startActivity(intent)
    }
}