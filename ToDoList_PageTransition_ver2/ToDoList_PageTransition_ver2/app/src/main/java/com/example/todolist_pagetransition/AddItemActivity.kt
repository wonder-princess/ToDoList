package com.example.todolist_pagetransition

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AddItemActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)

        var editText = findViewById<TextView>(R.id.input_text_add)

        //登録ボタン
        var submit_button = findViewById<Button>(R.id.submit_button_add)
        submit_button.setOnClickListener{view: View ->
            if (editText.text != null) {
                var listValue = findViewById<ListView>(R.id.list_value)
                listValue.addView(editText)
            }
        }

        //戻るボタン
        val back_button = findViewById<Button>(R.id.back_button_add)
        back_button.setOnClickListener(){
            finish()
        }
    }
}
