package com.example.myapplicationtest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CompanyAdapter(var companyData : ArrayList<Company>) : RecyclerView.Adapter<CompanyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = companyData[position]
        holder.tv_company.text = data.companyName
        holder.tv_address.text = data.companyAddress
        holder.tv_turnover.text = "${data.companyTurnover} Million Dollar"
    }

    override fun getItemCount(): Int {
        return companyData.size
    }

    class MyViewHolder(ItevView : View) : RecyclerView.ViewHolder(ItevView){
        var tv_company : TextView = itemView.findViewById(R.id.tv_company)
        var tv_address : TextView = itemView.findViewById(R.id.tv_address)
        var tv_turnover : TextView = itemView.findViewById(R.id.tv_turnover)
    }

}