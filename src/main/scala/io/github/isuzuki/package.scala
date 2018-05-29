package io.github

package object isuzuki {
  val config = pureconfig.loadConfigOrThrow[Config]
}
