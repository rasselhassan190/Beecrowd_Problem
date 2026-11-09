package beCrowedKotlin
fun main(){

    val (start, end) = readLine()!!.split(" ").map { it.toInt() }

    val duration : Int


    if (start == end){
        duration = 24
    }else if (start<end){
        duration = end - start
    }else{
        duration = (24 - start) + end
    }

    println("O JOGO DUROU $duration HORA(S)")
}