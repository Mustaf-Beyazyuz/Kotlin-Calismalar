package org.csystem.app.Signum

fun main() {
    println("Bir sayı giriniz")
    val a = readln().toInt()
    println(signumtest(a))
}
fun signumtest(a :Int): String
{
    if(a<0)
        return "-1 (Eksi Bir)"
    else if(0<a)
        return "1 (Bir)"
    else
        return "0 (Sıfır)"
}