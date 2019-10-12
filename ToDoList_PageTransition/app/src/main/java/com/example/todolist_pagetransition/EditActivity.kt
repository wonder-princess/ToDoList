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

        var getListFromMain = intent.getStringExtra("list_value")
        var getTextFromMain = intent.getStringExtra("select_text")
        var input_text = findViewById<TextView>(R.id.input_text_edit)
        input_text.text = getTextFromMain

        //登録ボタン
        var submit_button = findViewById<Button>(R.id.submit_button_edit)
        submit_button.setOnClickListener{view: View ->
//            getTextFromMain.setText(findViewById<TextView>(R.id.input_text_edit))
        }

        var delete_button = findViewById<Button>(R.id.delete_button_edit)
        delete_button.setOnClickListener{view: View ->

        }

        //戻るボタン
        var back_button = findViewById<Button>(R.id.back_button_edit)
        back_button.setOnClickListener(){
            finish()
        }

    }
}
