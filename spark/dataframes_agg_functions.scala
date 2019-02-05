
//Groupby and aggregate functions. Section 9, class 39
//Link: https://spark.apache.org/docs/2.2.0/api/scala/index.html#org.apache.spark.sql.functions$


import org.apache.spark.sql.SparkSession
val spark= SparkSession.builder().getOrCreate()
val df = spark.read.option("header", "true").option("inferSchema","true").csv("file_path/Sales.csv")

df.printSchema()
df.show()

/////////////////
///Functions////
////////////////
// Mean
df.groupBy("Company").mean().show()
//count
df.groupBy("Company").count().show()
//Max & Min
df.groupBy("Company").max().show()
df.groupBy("Company").min().show()
//sum
df.groupBy("Company").sum().show()
//SQL fucntions
df.select(sum("Sales")).show()
df.select(countDistinct("Sales")).show()
df.select(sumDistinct("Sales")).show()
df.select(variance("Sales")).show()
df.select(stddev("Sales")).show()
df.select(collect_set("Sales")).show()
//order results. Default is ascending
df.orderBy("Sales").show()
//Descending
df.orderBy($"Sales".desc).show()
