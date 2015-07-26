name := "jsonshootout"

organization := "com.despegar"

scalaVersion := "2.10.5"

resolvers += "spray" at "http://repo.spray.io/"

resolvers += "Mandubian repository snapshots" at "https://github.com/mandubian/mandubian-mvn/raw/master/snapshots/"

fork in run := true

libraryDependencies += "io.spray" %%  "spray-json" % "1.3.2"

libraryDependencies += "net.liftweb" % "lift-json-ext_2.10" % "3.0-M1"

libraryDependencies += "com.typesafe.play" % "play-json_2.10" % "2.4.2"

libraryDependencies += "org.json4s" % "json4s-native_2.10" % "3.3.0.RC3"

libraryDependencies += "org.json4s" % "json4s-jackson_2.10" % "3.3.0.RC3"

