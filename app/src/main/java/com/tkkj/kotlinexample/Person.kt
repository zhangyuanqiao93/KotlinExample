package com.tkkj.kotlinexample

import android.provider.ContactsContract

/**
 * Created by TKKJ on 2017/5/27.
 */


/**
 * class 标识的是主构造函数
 */
class Person1(var name: String,var age:Int,var college:String?){
    //声明变量必须使用关键字var，而如果要创建一个只读/只赋值一次的变量，则需要使用val代替它。
//    var name: String = ""
//    var age: Int = 0
//    var college: String? = null//? = null:表示可以为null(null safety)

    var email: String = ""
    //constructor关键字创建辅助构造函数
    constructor(name: String,age:Int,college:String?,email: String):this(name,age,college){
     this.email = email
    }
}

//构造函数实现，{}实际上，由于构造函数中没有其它操作，所以花括号也可以省略
class Table(var width: Int, var height:Int,var lenth:Int)


/**
 * Kotlin允许创建派生类
 *
 * 必须使用：代替Java中的extends关键字基类头
 * 1.必须有open注解基类
 * 2.必须有一个带参数的构造函数，
 * 3.派生类要在它自己的头中初始化那些参数
 *
 */
open class Person_new(var name: String, var age: Int, var college: String?) {

}

class Employee(name: String, age: Int, college: String?, var company: String) : Person_new(name, age, college) {
    override fun equals(other: Any?): Boolean {
        return super.equals(other)

    }


    /**
     * Kotlin允许，在不修改类的原始定义的情况下实现对类的扩展
     */
    fun Person1.isTeenager():Boolean{
        //13-19,返回的是true
        return age in 13..19
    }//需要扩展来自其它项目的类时，这个特性特别有用


    /**
     * 如果一个函数返回单个表达式的值，那么可以使用=来定义函数。
     *
     * Kotlin还支持高阶函数和Lambda表达式
     */

    fun isOctogenarian(): Boolean = age in 80 .. 89



}



