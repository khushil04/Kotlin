
//     write a java program for discount system 
//     create varible that user have membership
//       if amount is greater than 1000 then check for the membership 
//        if they have then print 20% dicount
//         if they dont have then print 10% discount
//     else the amount is less then 1000 then print no discount to the user 
//  

   fun main(){
    val totalAmount=1000
    val membership:Boolean = true
    
    if(totalAmount>=1000 && membership){
        println("20% discount")
    }
    else if(membership== false){
        println("10% discount")
    }
    else{
        println("no discount")
    
}}
// another method
fun main() {

val hasMembership=false
    val finalAmount:Int
    val totalAmount=1001
    
    if(totalAmount> 1000){
        if(hasMembership){
             finalAmount=totalAmount-totalAmount * 20 / 100
            println("Hurry! You got 20% discount.")
        println("Final ammount: $finalAmount")
        } 
   		else{
            finalAmount=totalAmount-totalAmount * 10 / 100
            println("Hurry! You got 10% discont.")
        println("Final amount: $finalAmount")
  			  }
   
   
    }
    
    else{
          println("Oops! No discount sorry. ")
       println("Final amount: $totalAmount")
    }
    
}
//class 26-08-24
//HW
/// calculator using arithemetic operators
fun main(){ 
 var a=10
var b=20
val choice = '+'
val result = when (choice){
    '+' -> a+b
    '-'->a-b
    '/'->a/b
    '*'->a*b
    '%'->a%b
    else  -> "choice out of bound"
}
println(result)
 }
 
 // using the loop print and add even numbers and sum of the array 


val numbers:Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9,10)
var sum=0;
    
        for(i in numbers){
            if(i%2==0){
                 print(i)
            sum=sum+i
            print(" ")
                      
              }
                    
        }
        println()
                    println("sum of even numbers" +sum)


                    

/// this program calculate factorial function 

fun factorial(): Int{
 
    var result =1
    for(i in 1 .. 5 )
    result = result*i
    println(result)
    return result  
}
fun main(){
    val x=factorial()
}



//this program calculate factorial using recursive function
fun factorial(n:Int):Int{
   
    if(n==0 || n==1){
    return 1
    }
    else{
        return n*factorial(n-1)
    } 
}
fun main(){
     var n=5
    println(factorial(n))
}


//sum of n number using recursive function

fun sum(n: Int): Int {
     return if (n == 1) {
       1
    } else {
       n + sum(n - 1)
    }
}


fun main(){
    var n=3
    
    println(sum(n))

///class


// Define the Person class
class Person(val name: String, var age: Int) {
    // Method to display person's details
    fun displayInfo() {
        println("Name: $name, Age: $age")
    }
}

fun main() {
    // Create two objects of the Person class
    val person1 = Person("Alice", 25)
    val person2 = Person("Bob", 30)

    // Display information for each object
    person1.displayInfo() // Outputs: Name: Alice, Age: 25
    person2.displayInfo() // Outputs: Name: Bob, Age: 30

    // Modify the age property of one object
    person1.age = 26
    person1.displayInfo() // Outputs: Name: Alice, Age: 26
}


   // Elvis Operator
    println("\nElvis Operator:")
    val nullableValue: String? = null
    val result = nullableValue ?: "Default Value"
    println("result = $result")  // Output: Default Value (returns right side if left is null)
}
    
