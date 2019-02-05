//Missing data. Section 9, class 40



import org.apache.spark.sql.SparkSession
val spark= SparkSession.builder().getOrCreate()
val df = spark.read.option("header", "true").option("inferSchema","true").csv("file_path/ContainsNull.csv")

df.printSchema()
df.show()
//drop, fill or replace
df.na.drop().show()
//dropping with less than a mimimum null values. Less than 2 for example:
df.na.drop(2).show()
//Fill nulls integer type with a number
df.na.fill(100).show()
//Fill null string with string
df.na.fill("empty").show()
//Select the column to Fill
df.na.fill("missing", Array("Name")).show()
df.na.fill(999, Array("Sales")).show()
//Example. Fill the sales with the average sales dataframe. Could be useful
df.select(mean("Sales")).show()
df.na.fill(400.5, Array("Sales")).show()
