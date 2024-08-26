// fun main(){
     val a = 20
     val b = 40
     val result = "Sum of $a a $b is ${a+b}"
     println(result)



//using string datatype in kotlin
multiple line string

     var a= """this is my
     first 
     program"""
     println(a)
   
 
//using boolean datatype in kotlin
 
     val A: Boolean = true
     print(A)
       val numbers = arrayOf(1,2,3,4,5)
       println(numbers[0])
      println(numbers[1])
        println(numbers[2])
          println(numbers[3])
            println(numbers[4])
 


 Array of strings
         val words: Array<String> = arrayOf("kotlin", "java","python")
      print(words[0])
       print(words[1])
    

// Array of squares lambda
         val square =  Array(5) {i -> i*i}
         println(square[0])
print(square[1])
    

//check the size of the array
     val numbers = arrayOf(1,2,4,5)
     val size = numbers.size
     print(size)

     //     check if the array is empty of not 
var isEmpty=words.isEmpty()
println("The array is empty: $isEmpty")
}