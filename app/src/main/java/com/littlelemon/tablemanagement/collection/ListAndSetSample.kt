package com.littlelemon.tablemanagement.collection

class ListAndSetSample {


    // list can accept duplicate element
    // elements are in order
    fun getList() : List<Int>{
        val list = listOf<Int>(1, 2, 3, 4)

        for (i in list) {
            print(i)
        }

        return list
    }

    // set can not accept duplicate
    // elements are not in order
    // set doesn't have index []
    fun getSet(): Set<Int> {

        val set = setOf(1, 2, 3,4,5)

        for (i in set) {
            print(i)
            print(set.size)
        }

        return set
    }
}