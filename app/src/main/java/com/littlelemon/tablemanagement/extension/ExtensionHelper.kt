package com.littlelemon.tablemanagement.extension

import android.widget.Toast
import androidx.activity.ComponentActivity

fun ComponentActivity.showMessage(text: String) {
    Toast.makeText(this, text, Toast.LENGTH_LONG).show()
}