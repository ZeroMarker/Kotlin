// set: list, set, map

fun setPlus(){
    val lists = listOf("apple", "banana", "grape", "peach")  // static

    for(fruit in lists){
        println(fruit)
    }

    val list = mutableListOf("apple", "banana", "grape", "peach")
    list.add("orange")

    val set = setOf(1, 2, 3)
    for (i in set) {
        println(i)
    }

    val map = mapOf("one" to 1, "two" to 2)
}

