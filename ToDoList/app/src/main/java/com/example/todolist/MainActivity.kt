package com.example.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list_value = findViewById<ListView>(R.id.list_value)
        val items =  Array(10, {i -> ""})
        val adapter = ArrayAdapter(applicationContext, android.R.layout.simple_expandable_list_item_1, items)
        list_value.adapter = adapter

        list_value.onItemClickListener = LIstItemClickListener()
    }
    private inner class LIstItemClickListener : AdapterView.OnItemClickListener{
        override fun onItemClick(parent: AdapterView<*>, view: View, position: Int, id: Long) {
            val dialog = InputDIalog()

            dialog.show(supportFragmentManager, "OrderConfirmDialogFragment")
        }
    }

}
