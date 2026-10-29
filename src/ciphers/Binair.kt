package ciphers

class Binair (
    override val name: String
): Cipher {
    val map = (0..127).associate { code ->
        code.toChar() to code.toString(2).padStart(8, '0')
    }
    override fun encode(mystery: String): String {
        return mystery.map { char ->
            map[char]}.joinToString("")
    }
    override fun decode(mystery: String): String {
        if (mystery.length % 8 != 0 || mystery.any { it != '0' && it != '1' }){
            return "Error"
        }
        return mystery.chunked(8).map { binary ->
            binary.toInt(2).toChar()
        }.joinToString("")
    }
}