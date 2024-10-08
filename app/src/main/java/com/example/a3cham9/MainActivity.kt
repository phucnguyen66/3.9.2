package com.example.a3cham9

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Khởi tạo RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        // Tạo danh sách sản phẩm mẫu
        val productList = listOf(
            Product("Product 1", 10.00),
            Product("Product 2", 20.00),
            Product("Product 3", 30.00),
            Product("Product 4", 40.00)
        )

        // Gán Adapter cho RecyclerView
        val adapter = ProductAdapter(productList)
        recyclerView.adapter = adapter

        // Điều chỉnh layout manager dựa trên kích thước màn hình
        if (resources.configuration.screenWidthDp >= 600) {
            recyclerView.layoutManager = GridLayoutManager(this, 2)
        } else {
            recyclerView.layoutManager = LinearLayoutManager(this)
        }
    }
}
