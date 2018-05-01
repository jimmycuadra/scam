import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.jimmycuadra",
      scalaVersion := "2.12.6",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "scam",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += "com.github.scopt" % "scopt_2.11" % "3.7.0",
    libraryDependencies += "com.github.rockjam" %% "play-json" % "2.7.0"
  )
