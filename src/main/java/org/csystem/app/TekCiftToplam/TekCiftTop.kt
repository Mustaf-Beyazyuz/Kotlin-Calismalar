package org.csystem.app.TekCiftToplam

fun main() {
    NegPozTest()
}
fun NegPozTest() {
    println("aralık 1. Ve 2 sayıları giriniz")
    var a = readln().toInt()
    var b = readln().toInt()
    var poz =0
    var neg = 0

    for (i in a..b)
    {
        if(i % 2 ==0 )
            poz +=i
        else
            neg += i
    }
    println("Çift sayılar  = $poz")
    println("tek sayılar = $neg")

}