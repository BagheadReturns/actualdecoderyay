import ciphers.Caesar

fun main(){
    val charset = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 .,!?@#$%"
    val base64 = Base64decoder()
    val caesarShift1 = Caesar(1, charset)

    val decoders = listOf(
        Caesar(0, charset),
        Caesar(1, charset),
        Caesar(2, charset),
        Caesar(3, charset),
        Caesar(4, charset),
        Caesar(5, charset),
        Caesar(6, charset),
        Caesar(7, charset),
        Caesar(8, charset),
        Caesar(9, charset),
        Caesar(10, charset),
        Caesar(11, charset),
        Caesar(12, charset),
        Caesar(13, charset),
        Caesar(14, charset),
        Caesar(15, charset),
        Caesar(16, charset),
        Caesar(17, charset),
        Caesar(18, charset),
        Caesar(19, charset),
        Caesar(20, charset)
    )

    println(Caesar(17, charset).encode("haha het werkt"))

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

    for (decoder in decoders) {
        println(decoder.decode(mystery))

    }

}