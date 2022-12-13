package com.jasimuddin.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    var countryNameList = ArrayList<String>()
    var detailsList = ArrayList<String>()
    var imageList = ArrayList<Int>()

    lateinit var adapter: countriesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView=findViewById(R.id.recyclerView)
        recyclerView.layoutManager=LinearLayoutManager(this@MainActivity)

        countryNameList.add("Bangladesh")
        countryNameList.add("India")
        countryNameList.add("China")
        countryNameList.add("United Kingdom")

        detailsList.add("This is the flag of Bangladesh")
        detailsList.add("This is the flag of India")
        detailsList.add("This is the flag of China")
        detailsList.add("This is the flag of United Kingdom")

        imageList.add(R.drawable.bd)
        imageList.add(R.drawable.india_image)
        imageList.add(R.drawable.china_image)
        imageList.add(R.drawable.uk_image)

        adapter=countriesAdapter(countryNameList,detailsList,imageList,applicationContext)
        recyclerView.adapter=adapter


    }
}