name := "reactive-streams-example"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.6"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-stream-experimental" % "0.10",
  "io.scalac" %% "reactive-rabbit" % "0.2.1",
  "com.typesafe.scala-logging" %%  "scala-logging-slf4j"      % "2.1.2",
  "ch.qos.logback"             %   "logback-core"             % "1.1.2",
  "ch.qos.logback"             %   "logback-classic"          % "1.1.2",
  "org.scalatest"              %%  "scalatest"                % "2.2.1" % "test"
)
