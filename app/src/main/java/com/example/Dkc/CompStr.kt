package com.example.Dkc

fun main(args :Array<String>){

    var str1="hellokotlin"
    var str2="Hellokotlin"

    /**
     * true if equals, otherwise false
     */

   println("String Equals? :${str1.equals(str2)}")

    /**
     * 0 if equals, otherwise false
     */

   println("String Equals? :${str1.compareTo(str2)}")

}