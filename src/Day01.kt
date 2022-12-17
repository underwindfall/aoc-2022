fun main() {
    val dayId = "01"
    val input = readInput("Day${dayId}")
    val ans = input
        .parts { it -> it.sumOf { it.toLong() } }
        .sortedDescending()
        .take(3)
        .sum()
    println(ans)
}
