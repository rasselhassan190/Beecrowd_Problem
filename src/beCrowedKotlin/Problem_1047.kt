
import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    val startHours = scanner.nextInt()
    val startMinute = scanner.nextInt()
    val endHours = scanner.nextInt()
    val endMinute = scanner.nextInt()


    val startTotalMinute = startHours * 60 + startMinute
    val endTotalMinute = endHours * 60 + endMinute


    var diffOfMinute = endTotalMinute - startTotalMinute


    if (diffOfMinute <= 0) {
        diffOfMinute += 24 * 60
    }

    val hours = diffOfMinute / 60
    val minutes = diffOfMinute % 60

    println("O JOGO DUROU $hours HORA(S) E $minutes MINUTO(S)")
}
