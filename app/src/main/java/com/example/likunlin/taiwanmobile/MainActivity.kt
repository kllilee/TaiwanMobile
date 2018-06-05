package com.example.likunlin.taiwanmobile

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private val btn_okhttp_click = View.OnClickListener{
        val intent = Intent(this,okthhp::class.java)
        startActivity(intent)
    }

    private val btn_gson_click = View.OnClickListener{
        val intent = Intent(this,gson::class.java)
        startActivity(intent)
    }

    private val btn_mvp_click = View.OnClickListener{
        val intent = Intent(this,mvp::class.java)
        startActivity(intent)
    }

    private val btn_mvvm_click = View.OnClickListener{

        val intent = Intent(this,mvvm::class.java)
        startActivity(intent)
    }

    private fun init() {
        btn_okhttp.setOnClickListener(btn_okhttp_click)
        btn_gson.setOnClickListener(btn_gson_click)
        btn_mvp.setOnClickListener(btn_mvp_click)
        btn_mvvm.setOnClickListener(btn_mvvm_click)
    }
}
