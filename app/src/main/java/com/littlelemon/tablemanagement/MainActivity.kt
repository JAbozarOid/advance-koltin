package com.littlelemon.tablemanagement

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.appcompat.widget.AppCompatButton
import com.littlelemon.tablemanagement.singletons.RestaurantTables

class MainActivity : ComponentActivity() {

    private val TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RestaurantTables.addCustomer("Abozar")
        RestaurantTables.addCustomer("Sweet")
        RestaurantTables.addCustomer("Mamad")
        Log.d(TAG, "onCreate: ${RestaurantTables.getCustomers()}")


        findViewById<AppCompatButton>(R.id.btn).setOnClickListener {
            startActivity(Intent(this,SecondActivity::class.java))
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ${RestaurantTables.getCustomers()}")
    }
}