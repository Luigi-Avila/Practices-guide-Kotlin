fun main() {
    //Collections
    val numbers = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
    println("List:	${numbers}")
    println("sorted:	${numbers.sorted()}")
    
    //Change numbers to set
    val setOfNumbers = numbers.toSet()
    println("set: ${setOfNumbers}")
    
    //mutable and immutable
    val set1 = setOf(1,2,3)
    val set2 = mutableSetOf(3,2,1)
    
    println("$set1 == $set2: ${set1 == set2}")
    
    //Method Contains
    println("contains 7: ${setOfNumbers.contains(7)}")
    
    //intersect
    println("intersection setOfNumbers and set1: ${setOfNumbers.intersect(set1)}")
    
    //union
    println("union setOfNumbers and set1: ${setOfNumbers.union(set1)}")
    
    //Maps or dictionary
    val peopleAges = mutableMapOf<String, Int>(
    	"Fred" to 30,
        "Ann" to 23
    )
    println(peopleAges)
    
    //Function Put and notation in map
    peopleAges.put("Barbara", 42)
   	peopleAges["Joe"] = 51
    println(peopleAges)
    
    //Update the map
    peopleAges["Fred"] = 31
    println(peopleAges)
    
    //function ForEach
    peopleAges.forEach{
        print("${it.key} is ${it.value}, ")
    }
    
    //function map
    println()
    println(peopleAges.map{ "${it.key} is ${it.value}" }.joinToString(", "))
    
    //function filter
    val filteredNames = peopleAges.filter {it.key.length < 4}
    println(filteredNames)
    
    //Lambdas unnamed function for example: foreach, filter. because do not have parentheses when calling them
    // example of function in lambda {a: Int -> a*3} parameters in left and process in rigth
    
    //function Lambda in variable
    //Option one
    val triple: (Int) -> Int = {a: Int -> a*3}
    println(triple(5))
    
   //Option two
   val tripleT: (Int) -> Int = {it * 3}
    println(tripleT(5))
   
   //higher order functions example: sortedWith()
   val peopleNames = listOf("Fred", "Ann", "Barbara", "Joe")
   println(peopleNames.sorted())
   println(peopleNames.sortedWith { str1: String, str2: String -> str1.length - str2.length })
   
   //List of words (App)
   val words = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")
   
   val filteredWords = words.filter { it.startsWith("b", ignoreCase = true)}
   		//Function shuffled() a copy of a collection with the elements mixed
        .shuffled()
        //Function take() get the first elements of the collection
        .take(2)
        .sorted()
   println(filteredWords)
}