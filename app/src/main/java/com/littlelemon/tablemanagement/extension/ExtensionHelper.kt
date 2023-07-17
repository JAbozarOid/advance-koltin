package com.littlelemon.tablemanagement.extension

import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.appcompat.widget.AppCompatTextView
import com.littlelemon.tablemanagement.entity.Dish

fun ComponentActivity.showMessage(text: String) {
    Toast.makeText(this, text, Toast.LENGTH_LONG).show()
}

fun Int.getFormattedAmount(): String {
    return if (this > 0)
        this.toString()
    else
        "Out of Stock"
}

fun AppCompatTextView.appendText(textToAppend: String) {
    val newText = "$text \n $textToAppend"
    text = newText
}

fun Dish.printIngredients() {
    println(this.ingredients)
}

fun Dish.removeSalt(ingredient: String) {
    this.ingredients.remove(ingredient)
}