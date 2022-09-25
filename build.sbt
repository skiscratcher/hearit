name := """hearit"""
organization := "com.skiscratcher"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.9"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
libraryDependencies += "com.lihaoyi" %% "scalatags" % "0.8.2"

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.skiscratcher.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.skiscratcher.binders._"
