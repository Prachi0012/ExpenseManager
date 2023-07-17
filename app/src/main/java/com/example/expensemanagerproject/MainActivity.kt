package com.example.expensemanagerproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.expensemanagerproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initview()


    }

    private fun initview() {

        binding.calender.setOnClickListener {
            val intent = Intent(this, Calender_Activity::class.java)
            startActivity(intent)
        }
        binding.addCategory.setOnClickListener {
            val intent = Intent(this, AddCategory_Activity::class.java)
            startActivity(intent)
        }
        binding.home.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        binding.payment.setOnClickListener {
            val intent = Intent(this, PaymentModeActivity::class.java)
            startActivity(intent)
        }

//        binding.navView.setNavigationItemSelectedListener {
//            when (it.itemId)
//            {
//                R.id.calender -> {
//                    val intent = Intent(this, Calender_Activity::class.java)
//                    startActivity(intent)
//                }
//
//                R.id.home -> {
//                    val intent = Intent(this, MainActivity::class.java)
//                    startActivity(intent)
//                }
//
//                R.id.add_category -> {
//                    val intent = Intent(this, AddCategory_Activity::class.java)
//                    startActivity(intent)
//                }
//
//                R.id.payment -> {
//                    val intent = Intent(this, PaymentModeActivity::class.java)
//                    startActivity(intent)
//                }
//
//            }
//            true
//
//
//        }

        var title_income = "Add Income"
        binding.layoutincome.setOnClickListener {
            val income = Intent(this, IncomeExpense_Activity::class.java)
            income.putExtra("page", "income")
            income.putExtra("title", title_income)
            startActivity(income)
        }
        var title_expense = "Add Expense"
        binding.layoutexpense.setOnClickListener {
            val expense = Intent(this, IncomeExpense_Activity::class.java)
            expense.putExtra("page", "expense")
            expense.putExtra("title", title_expense)
            startActivity(expense)
        }
        binding.layoutcategory.setOnClickListener {
            val intent = Intent(this, AddCategory_Activity::class.java)
            startActivity(intent)
        }
        binding.layouttrans.setOnClickListener {
            val intent = Intent(this, Transactions_Activity::class.java)
            startActivity(intent)
        }
        binding.imgcalender.setOnClickListener {
            val intent = Intent(this, Calender_Activity::class.java)
            startActivity(intent)
        }
        binding.imgmenu.setOnClickListener {
            binding.drawerlayout.openDrawer(binding.navView)

        }
        binding.imgcrown.setOnClickListener {
//            val i = Intent(this, PremiumActivity::class.java)
//            startActivity(i)

            var i = Intent(this, PremiumActivity::class.java)
            startActivity(i)
//            Toast.makeText(this, "Premium Activty", Toast.LENGTH_SHORT).show()
        }
        binding.addCategory.setOnClickListener {
            val intent = Intent(this, AddCategory_Activity::class.java)
            startActivity(intent)
        }
    }
}