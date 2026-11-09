package beCrowedKotlin

import java.util.Scanner

fun main(){

    val scanner = Scanner(System.`in`)
    val salary =  scanner.nextDouble()


    if (salary <= 2000.00){
        println("Isento")
    }else{
        val tax = when{
            salary <=3000.00 -> (salary -2000.00) * 0.08
            salary<= 4500.00 ->  80.00 +(salary- 3000.00) * 0.18
            else  -> 350.00 + (salary-4500.00)*0.28
        }

        println("R$ %.2f".format(tax))
    }


//
//    if (salary <=2000.00){
//        println("Isento")
//    }else{
//        var tax = 0.00
//
//        if (salary > 4500.00){
//
//            tax += (salary-4500)*0.28
//            tax += 1500.00 *0.18
//            tax += 1000.00* 0.08
//
//        }else if (salary > 3000.00){
//
//            tax += (salary-3000.00)*0.18
//            tax += 1000.00 * 0.08
//        }else{
//            tax +=(salary-200) * 0.08
//        }
//
//        println("R$ %.2f".format(tax))
//
//
//    }
}