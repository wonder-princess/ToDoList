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

        var input_text = findViewById<TextView>(R.id.input_text_edit)
        val selectedItem = intent.getStringExtra("selectedItem")
        //<> ← 型変換        
//        var listValue = findViewById<ListView>(R.id.list_value)
        // asの場合は成功したかしてないかがboolで帰ってくる（C#仕様）
        // 
//        var listValue = findViewById(R.id.list_value) as ListView
        var listValue = findViewById(R.id.list_value) as Mutablelist

        //登録ボタン
        var submit_button = findViewById<Button>(R.id.submit_button_edit)
        submit_button.setOnClickListener(){view: View ->
            selectedItem.text = findViewById<TextView>(R.id.input_text_edit).text
        }

        //削除ボタン
        var delete_button = findViewById<Button>(R.id.delete_button_edit)
        delete_button.setOnClickListener{view: View ->
            listValue.remove(selectedItem)
        }

        //戻るボタン
        var back_button = findViewById<Button>(R.id.back_button_edit)
        back_button.setOnClickListener(){
            finish()
        }
    }
}
