package io.github.isuzuki

import org.scalatest.{Matchers, WordSpec}

class ConfigTest extends WordSpec with Matchers {
  "loadConfig" should {
    "return database values" in {
      config.database.isInstanceOf[Database] shouldBe true
      config.database.db                     shouldBe "doobie_sample"
    }
  }
}
