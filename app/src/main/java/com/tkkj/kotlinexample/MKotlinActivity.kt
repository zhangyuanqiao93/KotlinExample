package com.tkkj.kotlinexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MKotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mkotlin)

        printSum(2,3)
    }


    fun sum1(a:Int,b:Int) = a+b



    fun sum2():Int{
//    val: 一次赋值的局部变量
        val a:Int = 1
        val b:Int = 2
        val c:Int =3
        return a+b+c
    }

    fun printSum(a: Int,b: Int){
        println("sum of $a and $b is ${a + b} ")
        var x = 5
        x += 1
    }


    fun maxOf(a: Int, b: Int): Int {
    /*    if (a > b) {
            return a
        } else {
            return b
        }*/
        //比较a,b大小
        val max = if (a>b) a else b
        return max
    }

    //创建实例，Kotlin没有关键字new
//    var jake = Person()

    var table = Table(0,0,0)
    /*fun main(args: Array<String>) {
        //Person类实例
//        jake.name = "tkkj"
//        jake.age = 24
//        jake.college = "SAU"

        //Table类
        table.height = 20
        println("max of 0 and 42 is ${maxOf(0, 42)}")

        val items = listOf("apple", "banana", "kiwi")
        for (item in items) {
            println(item)
        }

        val x = Unit
        when(x){
            //1-> print("x==1")
        }
    }*/


    /**
     * 特殊类，只包含数据
     * data class
     */
    data class Person(val name: String,val age: Int? = null)

    fun main(args: Array<String>){

        val persons = listOf(Person("Alice"),Person("Bob",age = 29))

        val oldest = persons.maxBy { it.age ?: 0 }
        println("The oldest is: $oldest")

        println("Hello Kotlin！")
        println(max(1,2))
        var name = if(args.size>0) args[0] else "Kotlin"

        println("Hello $name")
    }


    fun max(a: Int, b: Int): Int {
        return if (a > b) a else b
    }
}
