package org.csystem.app.Goldbach

fun main() {
goldBachTest()
}

fun goldBachTest()
{
    println("çift sayıyı giriniz")
    var x = readln().toInt()
    goldBachApp(x)
}
fun goldBachApp(x : Int)
{
    for(i in x downTo 0)
        for(j in 0.. i)
            if(asalsayi(i) && asalsayi(j))
                if (i+j == x)
                    println("${i}+ ${j} = ${x}")
}

fun asalsayi(a : Int) : Boolean
{
    if(a < 2) return false
    if (a % 2 == 0 && a != 2) return false
    if (a % 3 == 0 && a != 3) return false
    if (a % 5 == 0 && a != 5) return false
    if (a % 7 == 0 && a != 7) return false


    return true
}