package com.littlelemon.tablemanagement.collection

class MapSample {


    fun getMap(): Map<Int, Int> {

        val map = mapOf(
            1 to 12,
            2 to 14,
            3 to 15,
            3 to 16
        )

        for (i in map) {
            print("the key is ${i.key} and the value is ${i.value}")
            print(map.size)
            print(map[1])
        }

        return map
    }
}