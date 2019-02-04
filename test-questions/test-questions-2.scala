//Scala Basics Assessment Test Questions. Section 7, class 27

// 1.) Can you figure out what method you can use to find out if the list:
// List(1,2,3,4,5) contains the number 3?

println("1.) Can you figure out what method you can use to find out if the")
println("list: List(1,2,3,4,5) contains the number 3?")

val list_1 = List(1,2,3,4,5)

list_1 contains (3)

// 2.) How can you add all the elements of the previous list?

println("2.) How can you add all the elements of the previous list?")

list_1.sum

// 3.) Create an Array of all the odd numbers from 0 to 15

println("3.) Create an Array of all the odd numbers from 0 to 15")



val array_1= Array(Range(1,16,2))

// 4.) What are the unique elements in the list: List(2,3,1,4,5,6,6,1,2)?

println("4.) What are the unique elements in the list: List(2,3,1,4,5,6,6,1,2)?")

val list_2 = List(2,3,1,4,5,6,6,1,2)

//transform to set to get the uniwie elements

list_2.toSet

// 5.) Create a mutable map that maps together Names to Ages.
// It should have the following key value pairs:
//Sammy, 3
//Frankie, 7
//John, 45
println("5.) Create a mutable map that maps together Names to Ages.")
println("It should have the following key value pairs:")
println("Sammy, 3")
println("Frankie, 7")
println("John, 45")

val names = collection.mutable.Map(("Sammy",3),("Frankie",7),("John",45))

println("Now do the following:")
println("5a) Print out all the keys")

names.keys

names.values

println("5b) Add the key value pair ('Mike',27)")

names += ("Mike" -> 27)
