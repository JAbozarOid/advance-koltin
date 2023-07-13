package com.littlelemon.tablemanagement.entity

import com.littlelemon.tablemanagement.interfaces.Personnel

class Waiter : Personnel {

    val id : Int = -1
    val name : String = ""

    override fun serveCustomer() {

    }

    /**
     * inside the body of companion object there are static data
     */
    companion object {
        var branchName : String = ""
        var branchAddress : String = ""
    }
}