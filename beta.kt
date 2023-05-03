package com.example.kotlinbasic

import java.util.*
import kotlin.math.max

fun main() {
    var a = 2
    a++
    println("Hello World! $a")
}

fun reading() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()

    val b = readLine()!!.toInt()
    val c = readln().toInt()
}

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

// loop

val Range = 0..10   //[0, 10]

fun forLoop(){
    for (i in 0..10) {
        println(i)
    }
    for(i in 0 until 10 step 2){
        println(i)
    }

    val range = 0 until 10  //[0, 10)

    val ranges = 10 downTo 1 //[10, 1]
}

// OOP

fun oop(){
    class Person{
        // initial null value
        var name = ""
        var age = 0
        // member method
        fun eat(){
            print("%s is eating. He is %d years old.".format(name, age))
        }
    }
    // instantiate object and give initial value
    val p = Person()
    p.name = "Mark"
    p.age = 21
    p.eat()

    open class Personal(val name : String, val age : Int){              //default final
        fun eat(){
            print("%s is eating. He is %d years old.".format(name, age))
        }
    }

    class Student(val sno : String, val grade : Int, name : String, age : Int) : Personal(name, age){      // main constructor
        init {
            println("sno is $sno")
            println("grade is $grade")
        }
        constructor(name : String, age : Int) : this("", 0, name, age)
        constructor() : this("", 0)
    }

    val stu1 = Student()                     // constructor 2
    val stu2 = Student("Mark", 21)           // constructor 1
    val stu3 = Student("000", 5, "Mark", 21) // main constructor
}


// interface

interface Study{
    fun readBook()
    fun doHomework()
}
interface Research{
    fun readBook()
    // default implementation
    fun doHomework(){
        println("Someone doing homework.")
    }
}

fun myInterface(){
    open class Person(val name : String, val age : Int){
        fun eat(){
            print("%s is eating. He is %d years old.".format(name, age))
        }
    }
    // implement interface method readBook(), doHomework()
    class Student(val sno: String, val grade: Int, name: String, age: Int) : Person(name, age), Study{
        init {
            println("sno is$sno")
            println("grade is$grade")
        }
        override fun readBook(){
            println("$name is reading.")
        }
        override fun doHomework(){
            println("$name is doing homework.")
        }
    }

    fun doStudy(study: Study){
        study.readBook()
        study.doHomework()
    }

    fun stu(){
        val student = Student("123456", 12,"Mark", 21)
        doStudy(student)
    }
}

// data class

data class Cellphone(val brand: String, val price: Double)

fun cell(){
    val cellphone1 = Cellphone("Samsung", 1799.99)
    val cellphone2 = Cellphone("Samsung", 1799.99)
    println(cellphone1)
    println("cellphone1 equals cellphone2 " + (cellphone1 == cellphone2))
}

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

// lambda

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
