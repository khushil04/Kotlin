
fun main() {
    print("hello khushil")
    println("Hello, world!!!")
    // comments in kotlin

    // This is a single line comment
    /* this is a multi line comment 
     * this is a multi line comment package.
     * .
     * .
     *                                  */
     
     
}

////////////////////////////////////////////////////////////////////
// var in kotlin 
fun main(args:Array<String>){
    var a=40
    print(a)
    var khushil=40
    print(khushil)
}

////////////////////////////////////////////////////////////////////
// using `` in variable bec try is a keyword

fun main(args:Array<String>){
    var a=40
    print(a)
    var `try`=40
    print(`try`)
}

////////////////////////////////////////////////////////////////////
// giving error bec a is int but now changing to double so it will give error
fun main(args:Array<String>){
    var a=40
    a=40.5
    print(a)
    var Try=40
    print(Try)
}
