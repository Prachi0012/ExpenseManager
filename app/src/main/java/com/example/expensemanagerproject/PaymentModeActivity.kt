package com.example.expensemanagerproject

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.expensemanagerproject.Helper.DataHelper
import com.example.expensemanagerproject.ModelClass.CategoryModelClass
import com.example.expensemanagerproject.databinding.ActivityPaymentModeBinding

class PaymentModeActivity : AppCompatActivity() {
    lateinit var binding: ActivityPaymentModeBinding
    lateinit var db: DataHelper
    var datalst = ArrayList<CategoryModelClass>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPaymentModeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initview()
    }

    private fun initview() {


        var database = DataHelper(this, "Database.db", null, 1)
        binding.btnApply.setOnClickListener {

        }
        binding.btnApply.setOnClickListener {
            val name = binding.edtPaymentMode.text.toString()
            db.insertCategory(name)
            datalst = db.displaycategory()


            if (name.isEmpty())
            {

                Toast.makeText(this, "Enter Your Payment Mode", Toast.LENGTH_SHORT).show()
            }
            else {
                database.InsertModeData(name)
                Toast.makeText(this, "Data Added Succesfully", Toast.LENGTH_SHORT).show()
            }

        }




        binding.imgBack.setOnClickListener {

            onBackPressed()
        }

    }
}