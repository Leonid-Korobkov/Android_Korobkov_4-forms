package com.example.android_korobkov.l.android_korobkov_4_forms

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.android_korobkov.l.android_korobkov_4_forms.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(R.layout.activity_main)
        setContentView(binding.root)

        var radioButtonPaid = binding.radioButtonPaid
        val salaryLinearLayout = binding.salaryLinearLayout
        radioButtonPaid.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                salaryLinearLayout.visibility = View.VISIBLE
            } else {
                salaryLinearLayout.visibility = View.INVISIBLE
            }
        }
    }
}