//Dates and timestamps. Section 9, class 41

import org.apache.spark.sql.SparkSession
val spark= SparkSession.builder().getOrCreate()

val df = spark.read.option("header", "true").option("inferSchema","true").csv("path_file/CitiGroup2006_2008")
df.show()
df.printSchema()
// Select month
df.select(month(df("Date"))).show()
//Year
df.select(year(df("Date"))).show()
//build a dataframe with year column and groupByand get the means
val df2 = df.withColumn("Year",year(df("Date")))
val df3 = df2.groupBy("Year").mean()
df3.show()
//The columns are renamed starting with avg* so if want to get 1 column
df3.select($"Year",$"avg(High)").show()
//It could be done with min, max, etc.
val df4 = df2.groupBy("Year").max()
df4.select($"Year",$"max(High)").show()
