package com.example.todolist

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.DialogFragment

class InputDialog : DialogFragment(){
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity)
//        var inputText = findViewById<TextView>(R.id.input_text)
        builder.setTitle(R.string.dialog_title)
        builder.setPositiveButton(R.string.dialog_btn_submit, DialogButtonClickListener())
        builder.setNegativeButton(R.string.dialog_btn_cancel,DialogButtonClickListener())
        val dialog = builder.create()
        return dialog
    }

    private inner class DialogButtonClickListener : DialogInterface.OnClickListener{
        @SuppressLint("ResourceType")
        override fun onClick(dialog: DialogInterface, which: Int){
            var foo = ""
            when(which){
                DialogInterface.BUTTON_POSITIVE ->
                    foo = getString(R.id.input_text)
//                    items.add(findViewById<TextView>(R.id.input_text).text.toString())
                DialogInterface.BUTTON_POSITIVE ->
                    foo = ""
//                    inputText.setText("")
            }

        }
    }
}