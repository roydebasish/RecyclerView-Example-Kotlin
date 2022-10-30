package com.example.myapplicationtest

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplicationtest.R.*

class MainActivity : AppCompatActivity() {

    lateinit var rv_company : RecyclerView
    lateinit var companylist : ArrayList<Company>
    lateinit var companyAdapter: CompanyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        companylist = ArrayList<Company>()

        companylist.add(Company("MicroSoft Corporation ","United State America ",50))
        companylist.add(Company("Apple Incorporate ","United State America ",80))
        companylist.add(Company("Meta Incorporate ","United State America ",40))
        companylist.add(Company("Verizon ","United State America ",30))
        companylist.add(Company("Mastercard Limited ","United State America ",80))
        companylist.add(Company("T-Mobile ","United State America ",30))
        companylist.add(Company("Ford Motors ","United State America ",40))
        companylist.add(Company("General Electronics ","United State America ",20))
        companylist.add(Company("Tesla Private Limited ","United State America ",90))
        companylist.add(Company("SpaceX ","United State America ",100))
        companylist.add(Company("Boeing Airspace ","United State America ",60))
        companylist.add(Company("General Aviation ","United State America ",20))
        companylist.add(Company("Twitter Incorporated ","United State America ",50))
        companylist.add(Company("Nasa ","United State America ",80))

        rv_company = findViewById(id.rv_company)
        rv_company.layoutManager = LinearLayoutManager(this)
        companyAdapter = CompanyAdapter(companylist)
        rv_company.adapter = companyAdapter



    }
}