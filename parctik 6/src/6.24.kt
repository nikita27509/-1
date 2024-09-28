fun main() {
    val matrix = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )

    val transposedMatrix = matrix.mapIndexed { rowIndex, row ->
        row.mapIndexed { columnIndex, _ -> matrix[columnIndex][rowIndex] }
            .toIntArray()
    }.toTypedArray()

    println("Транспонированная матрица:")
    for (row in transposedMatrix) {
        println(row.joinToString(", "))
    }
}