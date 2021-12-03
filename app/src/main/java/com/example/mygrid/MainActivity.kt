package com.example.mygrid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var photoAdapter: PhotoAdapter
    private var dataList = mutableListOf<DataModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerview)
        recyclerView.layoutManager = GridLayoutManager(applicationContext, 2)
        photoAdapter = PhotoAdapter(applicationContext)
        recyclerView.adapter = photoAdapter

        dataList.add(DataModel("Title", "Desc", R.drawable.img1))
        dataList.add(DataModel("Title", "Desc", R.drawable.img2))
        dataList.add(DataModel("Title", "Desc", R.drawable.img3))
        dataList.add(DataModel("Title", "Desc", R.drawable.img4))
        dataList.add(DataModel("Title", "Desc", R.drawable.img5))
        dataList.add(DataModel("Title", "Desc", R.drawable.img1))
        dataList.add(DataModel("Title", "Desc", R.drawable.img2))
        dataList.add(DataModel("Title", "Desc", R.drawable.img3))
    }
}