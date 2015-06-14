name := "reactive-streams-example"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.6"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "io.scalac" %% "reactive-rabbit" % "1.0.0",
  "com.typesafe.akka" % "akka-stream-experimental_2.11" % "1.0-RC3"
)
