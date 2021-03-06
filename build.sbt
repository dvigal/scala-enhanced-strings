organization := "net.virtualvoid"

name := "scala-enhanced-strings"

version := "0.5.2"

homepage := Some(url("http://jrudolph.github.com/scala-enhanced-strings"))

licenses in GlobalScope += "BSD" -> url("https://raw.github.com/jrudolph/scala-enhanced-strings/master/LICENSE")

libraryDependencies ++=
  Seq("org.scala-tools.testing" % "specs_2.9.0-1" % "1.6.8" % "test",
      "org.scala-lang" % "scala-compiler" % "2.9.1")

scalacOptions ++= Seq("-unchecked", "-deprecation")

scalacOptions in (Compile, console) <+= (packageBin in Compile) map { bin =>
  "-Xplugin:"+bin.absolutePath
}

seq(lsSettings :_*)

(LsKeys.tags in LsKeys.lsync) := Seq("compiler-plugin", "string", "syntax", "string-interpolation")

(LsKeys.docsUrl in LsKeys.lsync) <<= homepage

(externalResolvers in LsKeys.lsync) := Seq(
  "Virtual-Void repository" at "http://mvn.virtual-void.net")

(description in LsKeys.lsync) :=
  "A scalac compiler plugin that adds string interpolation and more to scala."
