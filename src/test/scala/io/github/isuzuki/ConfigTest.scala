package io.github.isuzuki

import org.scalatest.{Matchers, WordSpec}

class ConfigTest extends WordSpec with Matchers {
  "loadConfig" should {
    "return database values" in {
      config.database.user shouldBe "doobie_user"
      config.database.pass shouldBe "doobie_pass"
      config.database.host shouldBe "192.168.99.100"
      config.database.db   shouldBe "doobie_sample"
    }
  }
}
