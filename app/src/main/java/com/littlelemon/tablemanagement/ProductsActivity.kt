package com.littlelemon.tablemanagement

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.appcompat.widget.AppCompatTextView
import com.littlelemon.tablemanagement.extension.appendText
import com.littlelemon.tablemanagement.extension.getFormattedAmount

class ProductsActivity : ComponentActivity() {

    private val products = listOf<Products>(
        Products(name = "Steak", amount = 5),
        Products(name = "Spaghetti", amount = 3),
        Products(name = "Coffee", amount = 10),
        Products(name = "Croissant", amount = 0)
    )

    override
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        findViewById<AppCompatTextView>(R.id.text_view_products).apply {
            for (product in products) {
                appendText("${product.name} (${product.amount.getFormattedAmount()})")
            }
        }
    }
}

data class Products(val name: String, val amount: Int)