// Dataframes operations. Section 9, class 38
// Link: https://spark.apache.org/docs/2.2.0/api/scala/index.html#package

import org.apache.spark.sql.SparkSession
val spark= SparkSession.builder().getOrCreate()
val df = spark.read.option("header", "true").option("inferSchema","true").csv("file_path/CitiGroup2006_2008")
df.printSchema()
////////////////
//Filtering////
//////////////
import spark.implicits._
df.filter($"Close" > 550).show()
// Or this line below is the same
df.filter("Close > 550").show()
// More filters
df.filter($"Close" < 500 && $"High" < 500).show()
// Or this line below is the same
df.filter("Close < 550 AND High < 500 ").show()
// Equal is with 3 === If not ii means boolean
df.filter($"Close" === 492.9).show()
// Or this line below is the same
df.filter("Close = 492.9").show()
// Collect is the way to transform dataframes into arrays
val df_filtered = df.filter("Close < 550 AND High < 500 ").collect()
// Count to get the shape
df.count()
df.filter("Close < 550 AND High < 500 ").count()
////////////////
//Correlation//
///////////////
df.select(corr("High","Low")).show()
