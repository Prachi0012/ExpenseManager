package com.example.expensemanagerproject

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.expensemanagerproject.databinding.ActivityMainBinding
import com.example.expensemanagerproject.databinding.ActivityRateingBinding

class RateingActivity : AppCompatActivity() {
    lateinit var binding: ActivityRateingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRateingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initview()
    }

    private fun initview() {

        binding.btnYes.setOnClickListener {

            val uri: Uri = Uri.parse("market://details?id=$packageName")
            val goToMarket = Intent(Intent.ACTION_VIEW, uri)

            goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY or
                    Intent.FLAG_ACTIVITY_NEW_DOCUMENT or
                    Intent.FLAG_ACTIVITY_MULTIPLE_TASK)
            try {
                startActivity(goToMarket)
            } catch (e: ActivityNotFoundException) {
                startActivity(Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://play.google.com/store/apps/details?id=com.mlab.expense.manager&hl=en-IN?id=$packageName")))
            }
        }
        binding.btnNo.setOnClickListener {
            Toast.makeText(this, "Cancel Rateing", Toast.LENGTH_SHORT).show()
            finish()
        }

    }
}