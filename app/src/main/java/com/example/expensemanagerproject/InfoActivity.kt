package com.example.expensemanagerproject

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView

class InfoActivity : AppCompatActivity() {
    lateinit var termsofservice : TextView
    lateinit var privacy : TextView
    lateinit var permission : TextView
    lateinit var btn1 : CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
        initview()
    }
    private fun initview() {
        termsofservice=findViewById(R.id.termsofservice)
        privacy=findViewById(R.id.privacy)
        btn1=findViewById(R.id.btn1)
        permission=findViewById(R.id.permission)
        termsofservice.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.termsfeed.com/blog/sample-terms-and-conditions-template/")
            startActivity(openURL)
        }
        privacy.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://play.google.com/store/apps/details?id=com.mlab.expense.manager&hl")
            startActivity(openURL)
        }
        permission.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://play.google.com/store/apps/details?id=com.mlab.expense.manager&hl=en-IN")
            startActivity(openURL)
        }
        btn1.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}