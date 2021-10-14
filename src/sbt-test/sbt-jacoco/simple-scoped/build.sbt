name := "jacocoTest"
organization := "com.navetas"

scalaVersion := "2.12.14"
scalacOptions ++= Seq("-deprecation", "-optimize", "-unchecked", "-Xlint", "-language:_")

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.4" % "test"

jacocoReportSettings in Test := JacocoReportSettings()
  .withThresholds(
    JacocoThresholds(
      instruction = 100,
      method = 100,
      branch = 100,
      complexity = 100,
      line = 100,
      clazz = 100)
  )
