package org.csystem.app.Baklava

fun main() {

    run()
}

fun run()
{
    var x : Int
    print("Kaç basamaklı olsun")
    x = readln().toInt()
    baklavaApp(x)
}

fun baklavaApp(x : Int)
{
    for (i in 1..  x)
    {

        for(j in x - i downTo 0)
            print(" ")
        for(z in 0 until i * 2 -1  )
            print("*")
        println()
    }

    for (i in x downTo  1)
    {
        for (j in 0 .. x - i)
            print(" ")
        for (z in 0 until i * 2 - 1)
            print("*")
        println()
    }


}