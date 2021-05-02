fun main(args: Array<String>) {
    println ("Please enter your name")
    val name = readLine()
    if (name == "Alice"){
        println("Welcome to the system $name")
    }
    else if (name == "Bob")
    {
        println("Welcome to the system $name")
    }
    else {
        println("System error! Your name is not Alice")
    }
}
