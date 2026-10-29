import kotlin.io.encoding.Base64
import kotlin.io.encoding.ExperimentalEncodingApi
class Base64decoder {
    fun decode(mystery: String): String {
        val decodedBytes = Base64.Default.decode(mystery)
        val decodedString = decodedBytes.decodeToString()
        return decodedBytes.decodeToString()
    }
}