name := "doobie-samples"

version := "0.1"

scalaVersion := "2.12.6"

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-target:jvm-1.8",
  "-Xfatal-warnings",
  "-Xfuture",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Ywarn-unused",
  "-Ywarn-unused-import",
  "-Yno-adapted-args"
)

libraryDependencies ++= Seq(
  "com.github.pureconfig" %% "pureconfig" % "0.9.1",
  "org.scalatest"         %% "scalatest"  % "3.0.5"  % "test"
)
