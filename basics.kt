/* Operators */

var fish = 2
//2

fish = 50
//50

val plants = 2
//2

plants = 50
//error

// ? for null
var rocks : Int? = null
var lotsOfFish : ListyString?> = listOf(null, null)
var everMoreFish : List<String>? = null
var definitelyFish : List<String?>? = null
definitelyFish = listOf(null, null)

// !! not null
goldfish = null
goldfish!!.eat()

// ?: 0
return fishFoodThreats?.dec() ?: 0

/* Strings */

val numberOfFish = 5
val numberOfPlants = 12
"I have $numberOfFish fish and $numberOfPlants plants"
// OR
"I have ${numberOfFish + $numberOfPlants} fish and plants"

// equal
if(fish == plant) 
// not equal
if(fish != plant) 

// ranges
val fish = 50
if (fish in 1..100) println(fish)
// OR
when (fish) {
    0 -> println("Empty")
    50 -> println("Full")
    else -> println("Perfect!")
}

/* Array and Loops */

val myList = mutableListOf("tuna","salmon","shark")
myList = mutableListOf("koi","golodfish")
// get an ERROR!!!!

// remove
val myList = mutableListOf("tuna","salmon","shark")
myList.remove("shark")

var fish = 12
var plants = 5
val swarm = listOf(fish, plants)

// array
val school = arrayOf("tuna","salmon","shark")
val numbers = intArrayOf(1,2,3)
// mix
val mix = arrayOf("fish", 2)
println(Arrays.toString(mix))

val array = Array(5) { it * 2}
println(array.asList())
// [0, 2, 4, 6, 8]

// for loop
var swarm = listOf(12, 5)
for (element in swarm) println(element)
// 12
// 5

// loop over the index
for ((index, element) in swarm.withIndex()) {
    println("Fish at $index is $element")
}

// range examples
for (i in 'b'..'g') print(i)
// OR
for (i in 1..5) print(i)
// OR
for (i in 5 downTo 1) print(i)
// OR
for (i in 3..6 step 2) print(i)

// recyclerview -> take DiffUtil !!!

