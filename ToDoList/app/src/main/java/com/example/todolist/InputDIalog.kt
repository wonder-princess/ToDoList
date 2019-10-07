package com.example.todolist

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.activity_main.*

class InputDIalog : DialogFragment(){
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity)

        builder.setTitle(R.string.dialog_title)
        builder.dialogTextData = input_text.toString()
        builder.setPositiveButton(R.string.dialog_btn_submit, DialogButtonClickListener())
        builder.setNegativeButton(R.string.dialog_btn_cancel,DialogButtonClickListener())


        val dialog = builder.create()
        return dialog
    }

    private inner class DialogButtonClickListener : DialogInterface.OnClickListener{
        override fun onClick(dialog: DialogInterface, which: Int){
            when(which){
                DialogInterface.BUTTON_POSITIVE ->
                    .setText(R.id.input_text)

                DialogInterface.BUTTON_NEGATIVE ->
                    msg = "キャンセル"
            }

        }
    }
}