import jdk.incubator.vector.VectorOperators.Binary

fun main() {
    println("Hello World!")

    var number: Int = 105
    println(number)

    var numberToDouble: Double = number.toDouble()
    println(numberToDouble)

    var byte: Byte = numberToDouble.toInt().toByte()
    println(byte)

    var long: Long = 100000L
    println(long)

    var binary: Int = 0b0101011
    println(binary)

    var binaryToDouble: Double = binary.toDouble()
    println(binaryToDouble)
}