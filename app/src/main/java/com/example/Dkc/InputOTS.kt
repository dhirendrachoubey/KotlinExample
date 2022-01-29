package com.example.Dkc

import java.util.Scanner
fun main(args: Array<String>){

    //creating Scanner object

    val read=Scanner(System.`in`)

    //Taking integer input
    println("Enter an integer number:")
    var num1=read.nextInt()

    ////Taking integer input
    println("Enter an float number:")
    var num2=read.nextFloat()

    //Displaying input numbers
    println("First Input Number: "+num1)
    println("Second Input Number: "+num2)
}