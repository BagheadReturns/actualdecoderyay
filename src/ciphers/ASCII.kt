package ciphers

class ASCII(
    override val name: String
): Cipher {
    val asciiMap: Map<Char, Int> = (32..126).associateBy { it.toChar() }

    val decodeAsciiMap: Map<Int, Char> =
        asciiMap.entries.associate { (char, code) -> code to char }

    override fun decode(mystery: String): String {
        println(decodeAsciiMap)
        val decoded = mystery.split(" ").mapNotNull { it.toIntOrNull()?.let {code -> decodeAsciiMap[code]} }.joinToString("")

        return decoded
    }
    override fun encode(mystery: String): String {
        val encoded = mystery.mapNotNull { char -> asciiMap[char] }.joinToString(" ")
        return encoded
    }

    fun encodeChar(c: Char): Int? {
        return asciiMap[c]
    }
}