import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.adamstrickland",
      scalaVersion := "2.12.1",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "josephus",
    // libraryDependencies += scalaTest % Test
    libraryDependencies ++= Seq(
      scalaTest % Test,
      "org.specs2" %% "specs2-core" % "3.8.9" % "test"
    ),
    scalacOptions in Test ++= Seq("-Yrangepos")
  )
