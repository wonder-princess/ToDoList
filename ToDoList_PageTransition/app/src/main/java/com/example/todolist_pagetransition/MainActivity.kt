package com.example.todolist_pagetransition

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //リスト
        var listValue = findViewById<ListView>(R.id.list_value)
        val items : MutableList<String> = mutableListOf()
        var adapter = ArrayAdapter(applicationContext, android.R.layout.simple_expandable_list_item_1, items)
        listValue.adapter = adapter
        listValue.onItemClickListener = LIstItemClickListener()

        //項目追加ボタンselectedItem
        var addButton = findViewById<Button>(R.id.add_button)
        addButton.setOnClickListener{view: View ->
            val intent = Intent(applicationContext, EditActivity::class.java)
            intent.putExtra("list_value",items as Array<String>)
            startActivity(intent)
        }
    }

    private inner class LIstItemClickListener : AdapterView.OnItemClickListener{
        override fun onItemClick(parent: AdapterView<*>, view: View, position: Int, id: Long) {
            val selectedItem = parent.getItemIdAtPosition(position) as String
            val intent = Intent(applicationContext, EditActivity::class.java)
            intent.putExtra("selectedItem",selectedItem)
            startActivity(intent)

        }
    }
}