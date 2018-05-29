package io.github.isuzuki

import cats.effect.IO
import doobie.scalatest.IOChecker
import doobie.util.transactor.Transactor
import doobie.util.transactor.Transactor.Aux
import io.github.isuzuki.Query.DML
import org.scalatest.{Matchers, WordSpec}

class QueryTest extends WordSpec with Matchers with IOChecker {
  lazy val transactor: Aux[IO, Unit] = Transactor.fromDriverManager[IO](
    driver = "com.mysql.jdbc.Driver",
    url    = s"jdbc:mysql://${config.database.host}/${config.database.db}?useSSL=false",
    user   = config.database.user,
    pass   = config.database.pass
  )

  "Query" when {
    "DML" can {
      "selectAll" in check(DML.selectAll)
    }
  }

}
