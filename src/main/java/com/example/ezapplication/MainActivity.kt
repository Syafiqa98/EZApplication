package com.example.ezapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import android.net.Uri
import android.widget.AdapterView
import android.widget.Button
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    // on below line we are creating
    // variables for grid view and course list
    lateinit var courseGRV: GridView
    lateinit var courseList: List<GridViewModal>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initializing variables of grid view with their ids.
        courseGRV = findViewById(R.id.idGRV)
        courseList = ArrayList<GridViewModal>()

        // on below line we are adding data to
        // our course list with image and course name.
        courseList = courseList + GridViewModal("Agoda-Hotel", R.drawable.agoda)
        courseList = courseList + GridViewModal("Booking-Hotel", R.drawable.booking)
        courseList = courseList + GridViewModal("Carousel-Shop", R.drawable.carousel)
        courseList = courseList + GridViewModal("Easybook-Transport", R.drawable.easybook)
        courseList = courseList + GridViewModal("GrabCar-Transport", R.drawable.grab)
        courseList = courseList + GridViewModal("Lazada-Shop", R.drawable.lazada)
        courseList = courseList + GridViewModal("Maxim-Transport", R.drawable.maxim)
        courseList = courseList + GridViewModal("Mudah-Shop", R.drawable.mudah)
        courseList = courseList + GridViewModal("Redbus-Transport", R.drawable.redbus)
        courseList = courseList + GridViewModal("Shopee-Shop", R.drawable.shopee)
        courseList = courseList + GridViewModal("Taxi Service-Transport", R.drawable.taxi)
        courseList = courseList + GridViewModal("Trivago-Hotel", R.drawable.trivago)
        courseList = courseList + GridViewModal("Zalora-Shop", R.drawable.zalora)

        // on below line we are initializing our course adapter
        // and passing course list and context.
        val courseAdapter = GridRVAdapter(courseList = courseList, this@MainActivity)

        // on below line we are setting adapter to our grid view.
        courseGRV.adapter = courseAdapter

        // on below line we are adding on item
        // click listener for our grid view.
        courseGRV.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            // inside on click method we are simply displaying
            // a toast message with course name.
            Toast.makeText(
                applicationContext, courseList[position].courseName + " selected",
                Toast.LENGTH_SHORT
            ).show()
        }
        }
    }

