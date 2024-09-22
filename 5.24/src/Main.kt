fun main()
{
    val matrix = arrayOf(
        intArrayOf(1, 3, 12),
        intArrayOf(54, 2, 8),
        intArrayOf(76, 65, 9)
    )

    println("Исходная матрица:")
    printMatrix(matrix)

    val transposedMatrix = transposeMatrix(matrix)

    println("\nТранспонированная матрица:")
    printMatrix(transposedMatrix)
}

fun transposeMatrix(matrix: Array<IntArray>): Array<IntArray>
{
    val rows = matrix.size
    val cols = matrix[0].size

    val transposedMatrix = Array(cols) { IntArray(rows) }

    for (i in 0 until rows)
    {
        for (j in 0 until cols)
        {
            transposedMatrix[j][i] = matrix[i][j]
        }
    }

    return transposedMatrix
}

fun printMatrix(matrix: Array<IntArray>)
{
    for (row in matrix)
    {
        for (col in row)
        {
            print("$col ")
        }
        println()
    }
}