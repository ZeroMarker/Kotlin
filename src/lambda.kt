fun myLambda(){
    //{para1: type, para2: type -> function body}
    val list = listOf("apple", "banana", "grape", "peach")
    val lambda = {fruit: String -> fruit.length}
    val maxLengthFruit1 = list.maxBy(lambda)
    println("The max length fruit of list is $maxLengthFruit1")

    // val maxLengthFruit2 = list.maxBy({fruit: String -> fruit.length})
    val maxLengthFruit3 = list.maxBy() {fruit: String -> fruit.length}
    val maxLengthFruit4 = list.maxBy {fruit: String -> fruit.length}
    val maxLengthFruit5 = list.maxBy {it.length}
}
