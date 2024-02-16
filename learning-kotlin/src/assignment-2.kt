// write a code that receive the base salary of an employee, calculate and show the salary knowing
// the employee receive a bonus of 5% and pay 7% of taxes.

fun calculateSalary(){
    print("Type the base salary: ")
    var salary: Double = readln().toDouble();

    var tax = calculateTax(salary);
    var bonus = calculateBonus(salary);

    println("The total amount the employee will receive is: ${salary + bonus - tax}")
}

fun calculateTax(baseSalary:Double) = baseSalary * 0.07;
fun calculateBonus(baseSalary: Double) = baseSalary * 0.05;