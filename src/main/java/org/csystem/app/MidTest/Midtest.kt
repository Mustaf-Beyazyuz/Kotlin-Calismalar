package org.csystem.app.MidTest

fun main() {

    println("1. sayıyı giriniz")
    val a = readln().toInt()
    println("2. sayıyı giriniz")
    val b = readln().toInt()
    println("3.sayıyı giriniz")
    val c = readln().toInt()
    println("Ortanca sayı = ${mid(a,b,c)}")
}

fun mid(a : Int, b : Int, c : Int): Int
{
    if(a <= b && b <= c || c <= b && b <= a)
        return b
    else if(b <= a && a <= c || c <= a && a <= b)
        return a
    else
        return c
}