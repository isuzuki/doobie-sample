package io.github.isuzuki

import cats.effect.IO
import cats.implicits._
import doobie.implicits._
import doobie.scalatest.IOChecker
import doobie.util.transactor.Transactor
import doobie.util.transactor.Transactor.Aux
import io.github.isuzuki.Query.{DDL, DML}
import org.scalatest.{BeforeAndAfterAll, Matchers, WordSpec}

class QueryTest extends WordSpec with Matchers with BeforeAndAfterAll with IOChecker {
  lazy val transactor: Aux[IO, Unit] = Transactor.fromDriverManager[IO](
    driver = "com.mysql.jdbc.Driver",
    url    = s"jdbc:mysql://${config.database.host}/${config.database.db}?useSSL=false",
    user   = config.database.user,
    pass   = config.database.pass
  )

  override def beforeAll(): Unit = {
    (DDL.drop, DDL.create).mapN(_ + _).transact(transactor).unsafeRunSync()
    ()
  }

  "Query" when {
    "DML" can {
      "selectAll" in check(DML.selectAll)
    }
  }

}
