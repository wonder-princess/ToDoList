package com.example.todolist_pagetransition

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_edit.*

class EditActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)

        val getTextFromMain = intent.getStringExtra("list_value")
        val input_text = findViewById<TextView>(R.id.edit_text)
        input_text.text = getTextFromMain

        //戻るボタン
        val back_button = findViewById<Button>(R.id.back_button)
        back_button.setOnClickListener(){
            finish()
        }

    }
}
