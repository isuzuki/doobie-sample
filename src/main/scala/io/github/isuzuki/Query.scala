package io.github.isuzuki

import doobie.free.connection.ConnectionIO
import doobie.implicits._
import doobie.util.query.Query0

object Query {
  object DDL {
    val create: ConnectionIO[Int] =
      sql"""
        CREATE TABLE IF NOT EXISTS item (
          id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
          name VARCHAR(255) NOT NULL UNIQUE KEY,
          created_at TIMESTAMP NOT NULL,
          updated_at TIMESTAMP NOT NULL,
          deleted_at TIMESTAMP DEFAULT NULL
        )
      """.update.run

    val drop: ConnectionIO[Int] =
      sql"""
        DROP TABLE IF EXISTS item
      """.update.run
  }

  object DML {
    val selectAll: Query0[Item] =
      sql"""
        SELECT
          id,
          name
        FROM
          item
      """.query[Item]
  }
}
