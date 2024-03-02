package com.example.disaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {

    private val homeFragment = HomeFragment()
    private val callFragment = CallFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val homeBtn : Button = findViewById(R.id.homeBtn)
        val callBtn : Button = findViewById(R.id.callBtn)
        val reportBtn : Button = findViewById(R.id.reportBtn)

        homeBtn.setOnClickListener {
            loadHome()
        }

        callBtn.setOnClickListener {
            loadCall()
        }

        reportBtn.setOnClickListener {
            val intent = Intent(this, AddDisasters::class.java)
            startActivity(intent)
        }
    }

    private fun loadHome(){
        val fragment = supportFragmentManager.findFragmentById(R.id.FragmentContainer)

        if (fragment == null){
            supportFragmentManager.beginTransaction().add(R.id.FragmentContainer,homeFragment).commit()
        } else {
            supportFragmentManager.beginTransaction().add(R.id.FragmentContainer,homeFragment).commit()
        }
    }

    private fun loadCall(){
        val fragment = supportFragmentManager.findFragmentById(R.id.FragmentContainer)

        if (fragment == null){
            supportFragmentManager.beginTransaction().add(R.id.FragmentContainer,callFragment).commit()
        } else {
            supportFragmentManager.beginTransaction().add(R.id.FragmentContainer,callFragment).commit()
        }
    }
}