package com.littlelemon.tablemanagement

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.appcompat.widget.AppCompatButton
import com.littlelemon.tablemanagement.entity.OrderItem
import com.littlelemon.tablemanagement.entity.TaxCalculator
import com.littlelemon.tablemanagement.entity.Waiter
import com.littlelemon.tablemanagement.singletons.RestaurantTables

class MainActivity : ComponentActivity() {

    private val TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // create an object without constructor ()
        RestaurantTables.addCustomer("Abozar")
        RestaurantTables.addCustomer("Sweet")
        RestaurantTables.addCustomer("Mamad")
        Log.d(TAG, "onCreate: ${RestaurantTables.getCustomers()}")

        findViewById<AppCompatButton>(R.id.btn).setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }

        // access the static data of the class Waiter from this class
        Waiter.branchName = "Little lemon main branch"
        Waiter.branchAddress = "Manchester, 25"


        // calculate tax for products
        val items: MutableList<OrderItem> = mutableListOf()
        items.add(0, OrderItem(name = "Burger", price = 8.00))
        items.add(1, OrderItem(name = "Fries", price = 4.00))
        items.add(2, OrderItem(name = "Soda", price = 2.00))
        items.add(3, OrderItem(name = "Ice Cream", price = 4.00))

        val tax: Double = TaxCalculator.getTaxAmountForOrderItems(orderItemList = items)
        Log.d(TAG, "TaxCalculator: $tax")

    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ${RestaurantTables.getCustomers()}")
    }
}