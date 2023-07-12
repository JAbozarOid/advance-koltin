package com.littlelemon.tablemanagement

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import com.littlelemon.tablemanagement.singletons.RestaurantTables

class SecondActivity : ComponentActivity() {

    private val TAG = SecondActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // there is data consistency for the add and remove function
        RestaurantTables.removeCustomer("Abozar")
        Log.d(TAG, "onCreate: ${RestaurantTables.getCustomers()}")
    }
}