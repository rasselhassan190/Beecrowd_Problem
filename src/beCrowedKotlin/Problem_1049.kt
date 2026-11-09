package beCrowedKotlin

import java.util.Scanner

fun main(){

    val scanner = Scanner(System.`in`)
    val word1 = scanner.next()
    val word2 = scanner.next()
    val word3 = scanner.next()


    val animal = if (word1 =="vertebrado"){
        if (word2 =="ave"){
            if (word3 == "carnivoro") "aguia" else "pomba"
        }else{
            if (word3 =="onivoro") "homem" else "vaca"
        }
    }else{
        if ( word2 == "inseto") {
            if (word3 == "hematofago") "pulga" else "lagarta"
        }else{
            if (word3 == "onivoro") "minhoca" else "sanguessuga"
        }
    }

    println(animal)

}