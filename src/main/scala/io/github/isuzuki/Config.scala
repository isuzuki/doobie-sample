package io.github.isuzuki

case class Config (
  database: Database
)

case class Database (
  user: String,
  pass: String,
  host: String,
  db:   String
)
