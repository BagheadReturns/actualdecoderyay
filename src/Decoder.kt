import java.nio.charset.Charset
import javax.crypto.Cipher

class Decoder(
    val trys: Int,
    val mystery: String,
    val charset: String,
    var ciphers: List<Cipher>
) {

}