package com.example.centling.kotlin_mydemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var one: Int? = null
    var two1: Int? = 1
    val two2: Int? = 1
    val two3: Int? = 1
    val two4: Int? = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        one = add(2,5)
        two1 = add(2,5)
    }

    fun add(a: Int, b: Int): Int? = a + b
}
