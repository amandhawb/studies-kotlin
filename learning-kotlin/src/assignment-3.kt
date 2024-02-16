// calculate the body mass index

fun calculateBMS() {
    print("Type your height: ")
    var height: Double = readln().toDouble();

    print("Type your weight: ")
    var weight: Double = readln().toDouble();

    println("Your BMS is: ${weight / height * height}");
}