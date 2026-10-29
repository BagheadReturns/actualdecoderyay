fun main(){
    val decoder = Base64decoder()
    println("Bagheads decoder!!\n how many layers deep? ")

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
    decoder.decode(mystery)
    val base64result = decoder.decode(mystery)

}