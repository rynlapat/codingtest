package com.example.codingtest2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.viewModels
import com.example.codingtest2.databinding.ActivityMainBinding
import com.example.codingtest2.ui.MainAdapter
import com.example.codingtest2.ui.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
 class MainActivity : AppCompatActivity(){
    lateinit var binding: ActivityMainBinding
    private val viewModel : MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val mainAdapter = MainAdapter()
        binding.recyclerView.adapter = mainAdapter
        viewModel.articles.observe(this,{
             mainAdapter.submitList(it)


        })

        setContentView(binding.root)
    }


    fun gotoNextPage(v: View){
        val intent = Intent(this@MainActivity,MainActivity3::class.java)
        startActivity(intent)

    }

}