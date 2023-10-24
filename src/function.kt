fun defFun(){
    // use math function
    fun largeNumber(a: Int, b: Int): Int{
        return max(a, b)    // kotlin.math
    }
    // simplify use math
    fun largeNumber1(a: Int, b: Int): Int = max(a, b)
    // use value = if-else
    fun largeNumber2(a: Int, b: Int): Int{
        val value = if(a > b){
            a
        }
        else{
            b
        }
        return value
    }
    // direct use if-else value
    fun largeNumber3(a: Int, b: Int): Int{
        return if(a > b){
            a
        }
        else{
            b
        }
    }
    // fun = if-else
    fun largeNumber4(a: Int, b: Int) = if(a > b){
        a
    }
    else{
        b
    }
    // simplify fun = if-else
    fun largeNum(a: Int, b: Int) = if(a > b) a else b
}

fun getScore(name: String) = when(name){
    // implement switch-case
    "Tom" -> 80
    "Amy" -> 95
    else -> 0
}

fun checkNum(num: Number){
    // check var datatype
    when(num){
        is Int -> println("Int")
        is Double -> println("Double")
        else -> println("Number is not support")
    }
}