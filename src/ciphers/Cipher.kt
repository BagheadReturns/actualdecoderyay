package ciphers

interface Cipher {
    fun decode(mystery: String): String
    fun encode(mystery: String): String
    val name: String
}