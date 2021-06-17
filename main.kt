fun main() {
    for(k in 1..100 ){
        if(k%3 == 0){
            println("Fizz")
        }
        if(k%5 == 0){
            println("Buzz")
        }
        if(k%3 == 0 && k%5 == 0){
            println("FizzBuzz")
        }
        println(k)
    }
}
