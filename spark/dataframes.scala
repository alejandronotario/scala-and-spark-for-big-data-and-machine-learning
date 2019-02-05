////Spark dataframes. Section 9, class 37

import org.apache.spark.sql.SparkSession
val spark= SparkSession.builder().getOrCreate()
// Options to open the file
val df = spark.read.option("header", "true").option("inferSchema","true").csv("file_path/CitiGroup2006_2008")
df.head(5)
// To display the rows as a dataframe
for (row <- df.head(5)){
  println(row)
}
// Columms
df.columns
// Describe stats
df.describe().show()
// Select a column
df.select("Volume").show()
// Select more than one column
df.select($"Date",$"Volume").show()
// New column. In this example the sum of two variables
val df2 = df.withColumn("HighPlusLow",df("High")+df("Low"))
// Dataframe info
df2.printSchema()
// Select and rename columns
df2.select(df2("HighPlusLow").as("HPL"), df2("Close")).show()
