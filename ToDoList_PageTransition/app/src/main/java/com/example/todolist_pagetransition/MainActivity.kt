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

        var listValue = findViewById<ListView>(R.id.list_value)
        val items : MutableList<MutableMap<String, String>> = mutableListOf()
        val from = arrayOf("text")
        val to = arrayOf(android.R.id.text1)
        var adapter = SimpleAdapter(applicationContext, items, android.R.layout.simple_expandable_list_item_2, from, to)
        listValue.adapter = adapter
        listValue.onItemClickListener = LIstItemClickListener()

        var addButton = findViewById<Button>(R.id.add_button)
        addButton.setOnClickListener{view: View ->
            val intent = Intent(applicationContext, EditActivity::class.java)
            intent.putExtra("list_value",items as Array<String>)
            startActivity(intent)
        }
    }

    private inner class LIstItemClickListener : AdapterView.OnItemClickListener{
        override fun onItemClick(parent: AdapterView<*>, view: View, position: Int, id: Long) {

            //MutableList<String>だと、putExtra()で渡せない？
            val items = parent.getItemIdAtPosition(position) as Array<String>
            val textOfItems = parent.getItemIdAtPosition(position) as MutableMap<String, String>
            val text = textOfItems["text"]

            val intent = Intent(applicationContext, EditActivity::class.java)
            intent.putExtra("list_value",items)
            intent.putExtra("select_text",text)
            startActivity(intent)
        }
    }
}
