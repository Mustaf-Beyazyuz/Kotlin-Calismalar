/*----------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örneği inceleyiniz. ** ile belirtilen çağrıda "tam uyum (best match)" dolayısıyla parametresiz
    foo çağrılır. Aşağıdaki Int parametreli fonksiyon için parametresiz foo varken default argüman anlamlı mıdır? Şüphesiz
    bu soru örnek özelinde düşünülmeldir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app

fun main()
{
  print("bir sayı giriniz")
  var a = readln().toInt()
  foo(a)
}
fun foo(a : Int)
{
  fun bar() = a % 2 == 0

  if(bar())

  else
    print("sayı tek");

}


