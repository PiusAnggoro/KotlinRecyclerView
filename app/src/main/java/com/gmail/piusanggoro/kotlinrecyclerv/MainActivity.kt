package com.gmail.piusanggoro.kotlinrecyclerv

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by piusanggoro on 27/03/18.
 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val users = ArrayList<User>()

        users.add(User("Pius Anggoro", "STMIK Akakom, Yogyakarta"))
        users.add(User("Simon Hoermann", "University of Canteburry, NZ"))
        users.add(User("Xueni Pan", "University of London"))
        users.add(User("Neil Trevett", "Khronos Group, ARM"))
        users.add(User("Mark Billinghurst", "University of South Australia"))
        users.add(User("Hannes Kaufmann", "TU Wien, Austria"))


        val adapter = CustomAdapter(users)
        recyclerView.adapter = adapter
    }
}