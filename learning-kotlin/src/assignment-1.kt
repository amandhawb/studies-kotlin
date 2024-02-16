// write a function that receives 3 numbers and calculate the simple arithmetic average

fun arithmeticAverage(): Int {
    print("Type the first number: ");
    var num1:Int = readln().toInt();

    print("Type the second number: ");
    var num2:Int = readln().toInt();

    print("Type the third number: ");
    var num3:Int = readln().toInt();

    return (num1 + num2 + num3) / 3;
}