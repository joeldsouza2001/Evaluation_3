package com.example.eval3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.eval3.adapter.ItemAdapter
import com.example.eval3.model.Item

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view);

        val data: List<Item> = listOf<Item>(
            Item(R.drawable.lightning1,"100 Credits Prize/Ticket Game Card"),
            Item(R.drawable.lightning1, "Card with coke"),
            Item(R.drawable.lightning1,"New Birthday Card"),
            Item(R.drawable.lightning1,"Birthday game card with Discount"),
            Item(R.drawable.lightning1,"Birthday game card with 10% discount")
        )

        val layoutManager: LayoutManager =
            GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = ItemAdapter(this, data)

        val spinner = findViewById<Spinner>(R.id.spinner)

        val adapter = ArrayAdapter.createFromResource(this,
            R.array.items, android.R.layout.simple_spinner_item)

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)


        spinner.adapter = adapter
    }
}
