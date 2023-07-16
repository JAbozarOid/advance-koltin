package com.littlelemon.tablemanagement.extension

import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.appcompat.widget.AppCompatTextView

fun ComponentActivity.showMessage(text: String) {
    Toast.makeText(this, text, Toast.LENGTH_LONG).show()
}

fun Int.getFormattedAmount(): String {
    return if (this > 0)
        this.toString()
    else
        "Out of Stock"
}

fun AppCompatTextView.appendText(textToAppend : String) {
    val newText = "$text \n $textToAppend"
    text = newText
}