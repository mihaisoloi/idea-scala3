import _root_.io.github.davidgregory084.ScalacOption

val commonSettings = Seq(
  scalaVersion      := "2.13.8",
  tpolecatScalacOptions ++= Set(
    ScalacOptions.source3,
    ScalacOptions.privateOption("tasty-reader") // For using libraries published for Scala 3
  )
)

val scala3CommonSettings = Seq(
  scalaVersion := "3.1.2",
  tpolecatScalacOptions += new ScalacOption(List("-indent"))
)

lazy val `common` = (project in file("common")).settings(scala3CommonSettings)

lazy val root = project
  .in(file("."))
  .settings(commonSettings)
  .settings(
    name := "idea-scala3",
    version := "0.1.0-SNAPSHOT",
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  ).dependsOn(common)
