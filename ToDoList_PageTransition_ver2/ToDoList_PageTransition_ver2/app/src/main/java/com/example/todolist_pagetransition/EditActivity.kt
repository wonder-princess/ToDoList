package com.example.todolist_pagetransition

import android.app.Activity
import android.content.Intent
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

        val selectedItem = intent.getStringExtra("selectedItem")
        var editText = findViewById<TextView>(R.id.input_text_edit)
        editText.text = selectedItem.toString()

        val intent = Intent(applicationContext, MainActivity::class.java)
        var buttonType = ""

        //登録ボタン
        var submit_button = findViewById<Button>(R.id.submit_button_edit)
        submit_button.setOnClickListener() { view: View ->
            buttonType = "edit"
            if (editText.text != null) {

                intent.putExtra("editText", editText.text.toString())
                intent.putExtra("buttonType", buttonType)
                setResult(Activity.RESULT_OK, intent)
            }

            //削除ボタン
            var delete_button = findViewById<Button>(R.id.delete_button_edit)
            delete_button.setOnClickListener { view: View ->
                buttonType = "remove"

                intent.putExtra("buttonType", buttonType)
                setResult(Activity.RESULT_OK, intent)
            }

            //戻るボタン
            var back_button = findViewById<Button>(R.id.back_button_edit)
            back_button.setOnClickListener() {
                finish()
            }
        }
    }
}
