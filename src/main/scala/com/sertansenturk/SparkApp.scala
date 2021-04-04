package com.sertansenturk
import com.sertansenturk.language.LanguageTransformer
import com.sertansenturk.schema.Language
import org.apache.spark.sql.{Dataset, SparkSession}

object SparkApp extends App{
  val spark = SparkSession.builder()
    .master("local[1]")
    .appName("SparkByExample")
    .getOrCreate();

  val transformer = new LanguageTransformer()(spark)

  println("First SparkContext:")
  println("APP Name :"+spark.sparkContext.appName);
  println("Deploy Mode :"+spark.sparkContext.deployMode);
  println("Master :"+spark.sparkContext.master);

  val columns = Seq("language","users_count")
  val data: Seq[(String, Int)] = Seq(("Java", 2000), ("Python", 100000), ("Scala", 300))

  val languages: Dataset[Language] = transformer.createLanguages(data)

  languages.printSchema()
  languages.show(false)
}