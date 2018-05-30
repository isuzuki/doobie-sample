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

val doobieVersion = "0.5.3"

libraryDependencies ++= Seq(
  "com.github.pureconfig" %% "pureconfig"           % "0.9.1",
  "mysql"                 %  "mysql-connector-java" % "5.1.45",
  "org.tpolecat"          %% "doobie-core"          % doobieVersion,
  "org.scalatest"         %% "scalatest"            % "3.0.5"        % "test",
  "org.tpolecat"          %% "doobie-scalatest"     % doobieVersion  % "test"
)
