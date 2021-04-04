package com.sertansenturk

import com.sertansenturk.language.LanguageTransformer
import org.scalatest.FlatSpec
import com.holdenkarau.spark.testing.DatasetSuiteBase
import com.sertansenturk.schema.Language
import org.apache.spark.sql.SparkSession

class LanguageTransformerTest extends FlatSpec with DatasetSuiteBase {
  import spark.implicits._
  implicit lazy val sparkImpl: SparkSession = spark
  lazy val transformer = new LanguageTransformer()(spark)

  "simple test" should "pass" in {
    assert(1 == 1)
  }

  "createLanguages" should "create a Dataset of Language" in {
    val data: Seq[(String, Int)] = Seq(("Java", 2000), ("Python", 100000), ("Scala", 300))

    val result = transformer.createLanguages(data)

    val expected = sc.parallelize(Seq(
      Language("Java", 2000),
      Language("Python", 100000),
      Language("Scala", 300))).toDS()

    assertDatasetEquals(result, expected)
  }
}
