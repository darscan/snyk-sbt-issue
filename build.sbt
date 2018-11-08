name := "snyk-issue"
organization := "com.example"

scalaVersion := "2.12.7"

libraryDependencies += "org.json4s" %% "json4s-jackson" % "3.6.2"

dependencyOverrides ++= Seq(
  "com.fasterxml.jackson.core"        %  "jackson-databind"         % jacksonVersion,
  "com.fasterxml.jackson.core"        %  "jackson-core"             % jacksonVersion,
  "com.fasterxml.jackson.core"        %  "jackson-annotations"      % jacksonVersion
)