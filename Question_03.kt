import java.util.Scanner

fun main(args: Array<String>) {
    
     val read = Scanner(System.`in`)
     var sum = 0
    
    println("Please enter your number:")
    var n = read.nextInt()
    
    for(a in 1..n){
        sum += a
    }
    
    println("The total sum is: $sum")
    
    
}
