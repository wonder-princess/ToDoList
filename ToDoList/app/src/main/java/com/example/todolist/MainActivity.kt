package com.example.todolist

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listValue = findViewById<ListView>(R.id.list_value)
        val items = ArrayList<String>()
        val adapter = ArrayAdapter(applicationContext, android.R.layout.simple_expandable_list_item_1, items)
        listValue.adapter = adapter
        listValue.onItemClickListener = LIstItemClickListener()

        val addButton = findViewById<Button>(R.id.add_button)
        addButton.setOnClickListener(AddButtonClickListener())
    }
    private inner class AddButtonClickListener : View.OnClickListener{
        override fun onClick(view: View) {

//            val dialog = InputDialog()
//            dialog.show(supportFragmentManager, "OrderConfirmDialogFragment")
        }
    }
    private inner class LIstItemClickListener : AdapterView.OnItemClickListener{
        override fun onItemClick(parent: AdapterView<*>, view: View, position: Int, id: Long) {
//            val dialog = EditDialog()
//            dialog.show(supportFragmentManager, "OrderConfirmDialogFragment")
        }
    }
}
