package com.example.expensemanagerproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.expensemanagerproject.Helper.DataHelper
import com.example.expensemanagerproject.ModelClass.CategoryModelClass
import com.example.expensemanagerproject.databinding.ActivityAddCategoryBinding

class AddCategory_Activity : AppCompatActivity() {

    lateinit var binding: ActivityAddCategoryBinding
    lateinit var db: DataHelper
    var datalist = ArrayList<CategoryModelClass>()
//    var adapter = CategoryAdapter(categorylist)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddCategoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        db = DataHelper(this, "Database.db", null, 1)

        category()
    }
    private fun category() {
        binding.btnadd.setOnClickListener {
            val name = binding.edtcategory.text.toString()
            db.insertCategory(name)
            datalist = db.displaycategory()
//            adapter.update(datalist)
        }
        binding.imgback.setOnClickListener {

            onBackPressed()

        }
        binding.imgright.setOnClickListener {

            val name = binding.edtcategory.text.toString()
            db.insertCategory(name)

            datalist = db.displaycategory()

//            var categoryAdapter= CategoryAdapter()
//            binding.rcvcate.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
//            binding.rcvcate.adapter = categoryAdapter

//            adapter.update(datalist)


        }
    }

}