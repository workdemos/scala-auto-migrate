lazy val commonSettings = Seq(
   organization := "com.example",
   version := "0.1.0",
   scalaVersion := "2.11.4"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
      name := "hello"
  )

name := "example-cli"
version := "1.0"

enablePlugins(JavaAppPackaging)


resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "com.typesafe.slick" %% "slick" % "2.1.0",
  "com.typesafe.slick" %% "slick-codegen" % "2.1.0",
  "org.slf4j" % "slf4j-nop" % "1.6.4",
  "mysql" % "mysql-connector-java" % "5.1.30",
  "org.scalaj" %% "scalaj-http" % "1.1.3",
  "net.liftweb" %% "lift-json" % "2.6-M4",
  "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test",
  "org.scalacheck" %% "scalacheck" % "1.12.1" % "test",
   "com.github.nscala-time" %% "nscala-time" % "1.6.0",
  "com.typesafe.akka" %% "akka-actor" % "2.3.9"
)

