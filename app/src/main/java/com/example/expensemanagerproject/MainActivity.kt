package com.example.expensemanagerproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
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
        binding.imgmenu.setOnClickListener {
            binding.drawerlayout.openDrawer(binding.navView)

        }

        binding.navView.setOnClickListener {

            binding.drawerlayout.openDrawer(binding.navView)
        }


        binding.navView.setNavigationItemSelectedListener {
            when (it.itemId)
            {
                R.id.calender -> {
                    val i = Intent(this, Calender_Activity::class.java)
                    startActivity(i)
                }

                R.id.Home -> {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }

                R.id.Category -> {
                    val intent = Intent(this, AddCategory_Activity::class.java)
                    startActivity(intent)
                }

                R.id.payment -> {
                    val intent = Intent(this, PaymentModeActivity::class.java)
                    startActivity(intent)
                }
                R.id.Share -> {
                    val shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.type = "text"
                    val app_url = " https://play.google.com/store/apps/details?id=com.mlab.expense.manager&hl=en-IN"
                    shareIntent.putExtra(Intent.EXTRA_TEXT, app_url)
                    startActivity(Intent.createChooser(shareIntent, "Share"))

//                    val sendIntent = Intent()
//                    sendIntent.action = Intent.ACTION_SEND
//                    sendIntent.type = "text/plain"
//                    startActivity(sendIntent)
                }


                R.id.rate -> {
                    val intent = Intent(this, RateingActivity::class.java)
                    startActivity(intent)
                }
                R.id.Lock -> {
                    val intent = Intent(this, LockScreenActivity::class.java)
                    startActivity(intent)
                }

                R.id.termsofservice -> {
                    val openURL = Intent(Intent.ACTION_VIEW)
                    openURL.data = Uri.parse("https://www.termsfeed.com/blog/sample-terms-and-conditions-template/")
                    startActivity(openURL)
                }

                R.id.privacy -> {
                    val openURL = Intent(Intent.ACTION_VIEW)
                    openURL.data = Uri.parse("https://play.google.com/store/apps/details?id=com.mlab.expense.manager&hl")
                    startActivity(openURL)
                }

            }
            true
//        binding.calender.setOnClickListener {
//            val intent = Intent(this, Calender_Activity::class.java)
//            startActivity(intent)
//        }
//        binding.addCategory.setOnClickListener {
//            val intent = Intent(this, AddCategory_Activity::class.java)
//            startActivity(intent)
//        }
//        binding.home.setOnClickListener {
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//        }
//        binding.payment.setOnClickListener {
//            val intent = Intent(this, PaymentModeActivity::class.java)
//            startActivity(intent)
//        }

        }
        binding.drawerlayout.setOnClickListener {
            binding.drawerlayout.closeDrawer(binding.navView)
        }

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

        binding.imgcrown.setOnClickListener {
//            val i = Intent(this, PremiumActivity::class.java)
//            startActivity(i)

            var i = Intent(this, PremiumActivity::class.java)
            startActivity(i)
//            Toast.makeText(this, "Premium Activty", Toast.LENGTH_SHORT).show()
        }
        binding.layoutcategory.setOnClickListener {
            val intent = Intent(this, AddCategory_Activity::class.java)
            startActivity(intent)
        }
    }
}