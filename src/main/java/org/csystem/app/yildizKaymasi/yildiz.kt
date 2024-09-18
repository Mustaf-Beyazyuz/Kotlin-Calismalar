package org.csystem.app.yildizKaymasi

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Kullanıcıdan height ve width değerlerini alıyoruz
    print("Height (yükseklik) giriniz: ")
    val height = scanner.nextInt()
    print("Width (genişlik) giriniz: ")
    val width = scanner.nextInt()

    // Satırları oluşturuyoruz
    for (i in 0 until height) {
        // Boşluk miktarını belirliyoruz
        val spaces = i % (2 * (width + 1))

        // Eğer spaces, width'i geçerse ters yöne geçmek için ayarlıyoruz
        val adjustedSpaces = if (spaces > width) 2 * (width + 1) - spaces - 1 else spaces

        // Deseni yazdırıyoruz
        print("|")
        for (j in 0 until adjustedSpaces) {
            print(" ")
        }
        print("*")

        for (j in adjustedSpaces + 1..width) {
            print(" ")
        }
        println("|")
    }
}
