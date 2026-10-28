import java.util.Base64

fun main(){
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


}