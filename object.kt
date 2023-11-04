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