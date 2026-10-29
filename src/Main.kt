import ciphers.Caesar
import ciphers.ASCII
import ciphers.Cipher
import ciphers.Binair

fun main(){
    val charset = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 .,!?@#$%"
    val base64 = Base64decoder()

    val ciphers: List<Cipher> =
        listOf(ASCII("ASCII"), Binair("Binair")) + (0..1).map { Caesar(it, charset, "CaesarShift$it") } // maakt eerst de Ascii class en zet dan alle Caesar objecten erbij

    println("Bagheads decoder!\n how many layers deep? ")

    var layerAmount: Int? = null

    while (layerAmount == null) {
        print("Numbers of layers: ")
        layerAmount = readln().toIntOrNull()

        if (layerAmount == null) {
            println("Please enter a number")
        }
    }
    println("Going $layerAmount layers deep!")

    print("place your mystery here:")

    val mystery = readln()


    for (cipher in ciphers) {
        println(cipher.name + " " + cipher.decode(mystery))

    }
}