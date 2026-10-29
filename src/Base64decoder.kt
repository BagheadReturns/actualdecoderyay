import kotlin.io.encoding.Base64
class Base64decoder {
    fun decode(mystery: String): String {
        val decodedBytes = Base64.decode(mystery)
        val decodedString = decodedBytes.decodeToString()
        return decodedBytes.decodeToString()
    }
}