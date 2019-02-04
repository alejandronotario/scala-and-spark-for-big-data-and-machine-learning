//Scala Basics Assessment Test Questions. Section 8, class 34

// 1. Check for single even

println("1. Check form single even")

def checkEven(num:Int): Boolean ={
  return num%2 == 0
}
println(checkEven(4))
println(checkEven(3))

// 2. Check for evens in a list

println("2. Check for evens in a list")

def checkList(numbers:List[Int]): Boolean = {
  for (n <- numbers) {
    if (n%2 == 0){
      return true
    }
  }
  return false
}

val evensample = List(1,2,3,4,5)
val oddsample  = List(1,3,5,7)
println(checkList(evensample))
println(checkList(oddsample))

// 3. Lucky numeber seven. Take in a list of integers and calculate their sum.
// However, sevens should be counted twice, meaning their value is 14 for the
// sum. Assume the list is empty

println("3. Lucky numeber seven")

def lucky(nums:List[Int]): Int={
  var output = 0
  for(n<-nums){
    if(n==7){
      output=output + 14
    }else{
      output=output + n
    }
  }
  return output
}

val numbers = List(1,2,3,7)
println(lucky(numbers))

// 4. Can you balance? Given a non-empty list of integers, return true if
// there is a place to split the list so that the sum of the numbers on one side
// is equal to the sum of the numbers on the other side.

println("4. Can you balance?")

def balanceCheck(mylist:List[Int]) : Boolean={
  var firsthalf=0
  var secondhalf=0

  secondhalf=mylist.sum
  for(i<-Range(0, mylist.length)){
    firsthalf = firsthalf + mylist(i)
    secondhalf = secondhalf - mylist(i)

    if(firsthalf==secondhalf){
      return true
    }

  }
  return false
}

val testlist = List(1,2,3,4,10)
val testlist2 = List(2,3,3,2)
val testlist3= List(10,20,70)

println(balanceCheck(testlist))
println(balanceCheck(testlist2))
println(balanceCheck(testlist3))

// Palindrome check. Given a string, return a Boolean indicating whether or
// no it is a Palindrome

println("Palindrome check")

def palindromeCheck(st:String): Boolean={
  return(st==st.reverse)
}

println(palindromeCheck("eessddssee"))
println(palindromeCheck("Goodbye"))
