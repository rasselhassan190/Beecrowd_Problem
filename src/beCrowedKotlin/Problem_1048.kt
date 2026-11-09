package beCrowedKotlin

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    var mainSalary = scanner.nextDouble()

    val percentage = when{
        mainSalary <=400.00 -> 15
        mainSalary <=800.00 -> 12
        mainSalary <= 1200.00 -> 10
        mainSalary <= 2000.00 -> 7
        else -> 4
    }

    val earnedMoney = ( mainSalary* percentage)/100
    val newSalary = mainSalary+earnedMoney
    println("Novo salario: %.2f".format(newSalary))
    println("Reajuste ganho: %.2f".format(earnedMoney))
    println("Em percentual: $percentage %")


}