scalaVersion := "2.12.1"

lazy val goToSleep = taskKey[Unit]("Make sbt hang so we have a jstack target.")
goToSleep := {
  "sleep 1m" !
}
