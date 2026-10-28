package ciphers

interface Decoder {
    fun decode(mystery: String): String
}