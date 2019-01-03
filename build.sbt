enablePlugins(ScalaJSBundlerPlugin)

name := "aws-tooling"

version := "0.1"

scalaVersion := "2.12.8"

scalaJSUseMainModuleInitializer := true
scalaJSModuleKind := ModuleKind.CommonJSModule
mainClass in Compile := Some("org.kae.awstooling.Main")
moduleName in fullOptJS := "aws-tooling"

resolvers ++= Seq(
  Resolver.sonatypeRepo("releases")
)

libraryDependencies ++= Seq(
  "org.typelevel" %%% "cats-effect" % "1.1.0"
)

scalacOptions ++= Seq(
  "-P:scalajs:sjsDefinedByDefault"
)

npmDependencies in Compile ++= Seq(
  "aws-sdk" -> "^2.382.0",
   "uuid" -> "^3.3.2"
)
