package com.sertansenturk.archetype.extract.transformation

import com.sertansenturk.archetype.extract.schema.Language
import org.apache.spark.sql.{ Dataset, SparkSession }

class LanguageTransformer(implicit spark: SparkSession) extends Serializable {
  import spark.implicits._

  def createLanguages(data: Seq[(String, Int)]): Dataset[Language] = {
    spark.sparkContext.parallelize(data).toDF(Language.COLUMNS: _*).as[Language]
  }
}
