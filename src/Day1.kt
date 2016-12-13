import java.nio.file.Files
import java.nio.file.Paths
import org.testng.Assert
import org.testng.annotations.Test
import java.io.File

/**
 * Created by Niamh on 13/12/2016.
 */

class day1 {
    @Test
    fun simpleTest() {
        Assert.assertEquals(2, 1+1)
    }

    @Test
    fun testConvertInputToArray() {
        val input = "R2, L3"
        val array = convertToArray(input)

        val expectedResult = listOf("R2", "L3")

        Assert.assertEquals(array, expectedResult)
    }
}

fun main(args: Array<String>) {
    val input = File("data/day1_input.txt").readText(charset = Charsets.UTF_8)
    println(input)
}

fun convertToArray(input: String): List<String> {
    val inputString = input.replace(" ", "")
    val array = inputString.split(',')
    return array
}





