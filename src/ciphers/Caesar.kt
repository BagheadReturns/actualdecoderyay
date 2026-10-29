package ciphers

class Caesar(
    var n: Int,
    val charset: String,
    override val name: String
): Cipher{
    private val map: Map<Char, Char> = makeMap()
    private val decodeMap: Map<Char, Char> =
        map.entries.associate { (key, value) -> value to key }

    private fun makeMap(): Map<Char, Char> {
        return charset.mapIndexed { index, char ->
            char to charset[(index + n) % charset.length]
        }.toMap()
    }

    override fun encode(mystery: String): String {
        return mystery.map { char ->
            map[char] ?: char
        }.joinToString("")
    }

    override fun decode(mystery: String): String {
        return mystery.map { char ->
            decodeMap[char] ?: char
        }.joinToString("")
    }
}