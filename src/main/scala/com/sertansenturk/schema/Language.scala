package com.sertansenturk.schema

case class Language(
                          language: String,
                          users_count: Int
                          )

object Language {
  val COLUMNS = Seq("language", "users_count")
}