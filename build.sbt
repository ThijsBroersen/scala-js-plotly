enablePlugins(ScalaJSPlugin)

name := "Scala.js plotly.js"

normalizedName := "scalajs-plotly"

organization := "nl.thijsbroersen"

scalaVersion := "2.12.7"

scalacOptions ++= Seq("-deprecation", "-feature", "-P:scalajs:sjsDefinedByDefault")

crossScalaVersions := Seq("2.11.12", "2.12.7")

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.singlespaced" %%% "scalajs-d3" % "0.3.4"
)
