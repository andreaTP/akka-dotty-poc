val dottyVersion = "0.16.0-RC3"

// val silencerVersion = "1.4.1"

lazy val root = project
  .in(file("."))
  .settings(
    // default
    name := "akka-dotty",
    version := "0.1.0",
    scalaVersion := dottyVersion,
    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test",


    // debug
    logLevel := Level.Error,
    libraryDependencies ++= Seq(
      "com.typesafe" % "config" % "1.3.4",
      "org.scala-lang.modules" % "scala-java8-compat_2.12" % "0.9.0"
    )

    // libraryDependencies ++= Seq(
    //       compilerPlugin("com.github.ghik" %% "silencer-plugin" % silencerVersion),
    //       "com.github.ghik" %% "silencer-lib" % silencerVersion % Provided)
  )
