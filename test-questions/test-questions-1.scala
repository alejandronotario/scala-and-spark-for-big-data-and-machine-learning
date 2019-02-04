//Scala Basics Assessment Test Questions. Section 6, class 19

//1.What is 2 to the power of 5?

println ("1. What is 2 to the power of 5?")
val a = math.pow(2,5)
println("result: " + a)

//2.What is the remainder of 180 divided by 7?
println ("2. What is the remainder of 180 divided by 7?")
val b = 180%7
println("result: " + b)

//3. Given variable pet_name = 'Sammy', use string interpolation to print out
// 'My dog's name is Sammy.'

println("3. Given variable pet_name = 'Sammy', use string interpolation to")
println("print out 'My dog's name is Sammy.'")
val pet_name = "Sammy."
val sent = "My dog's name is"
val string_1= s"${sent} ${pet_name}"
println("result: " + string_1)

//4. Use scala to find out if the letter sequence "xyz" is contained
// in:"sadfjshfjyuyxyzjkfuidkjklhasyysdfk"

println("4. Use scala to find out if the letter sequence 'xyz' is contained")
println("in:'sadfjshfjyuyxyzjkfuidkjklhasyysdfk'")
val string_2 = "sadfjshfjyuyxyzjkfuidkjklhasyysdfk"
string_2  contains "xyz"

//5. What is the difference between a value and a variable?

println("5. What is the difference between a value and a variable?")
println("var is mutable and val is not, once a val is assigned it keeps the same value")

//6. Given the tuple (1,2,3,(4,5,6)) retrieve the number 6.

println("6. Given the tuple (1,2,3,(4,5,6)) retrieve the number 6.")

val mytuple = (1,2,3,(4,5,6))
mytuple._4._3
