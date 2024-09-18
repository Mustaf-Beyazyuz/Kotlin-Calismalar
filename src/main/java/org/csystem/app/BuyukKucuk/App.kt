package org.csystem.app.BuyukKucuk

import kotlin.math.min

fun main() {

    println("1. Sayı : ")
    val a = readln().toInt()
    println("2 . sayı : ")
    val b = readln().toInt()
    println("3 . sayı : ")
    val c = readln().toInt()
    BuyukKucuk(a,b,c)
}

fun BuyukKucuk(a : Int , b : Int, c : Int)
{
    var eb = Math.max(a,Math.max(b,c))
    var ek = Math.min(a,Math.min(b,c))
    var o =  a + b + c - ek - eb

    if (eb != o && o !=ek)
        println("$ek <  $o < $eb ")

    else if(ek == o && o !== eb)
        println("$ek =  $o < $eb ")
    else if(ek < o && o == eb)
        println("$ek <  $o = $eb ")
    else
        println("$eb =  $o = $eb ")
}