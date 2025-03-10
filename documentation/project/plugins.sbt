// Copyright (C) from 2022 The Play Framework Contributors <https://github.com/playframework>, 2011-2021 Lightbend Inc. <https://www.lightbend.com>

// Comment to get more information during initialization
logLevel := Level.Warn

lazy val plugins = (project in file(".")).dependsOn(playDocsPlugin)

lazy val playDocsPlugin = ProjectRef(Path.fileProperty("user.dir").getParentFile, "Play-Docs-Sbt-Plugin")

// Required for Production.md
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "2.1.0")

// Add headers to example sources
addSbtPlugin("de.heikoseeberger" % "sbt-header"         % "5.9.0")
addSbtPlugin("com.lightbend.sbt" % "sbt-java-formatter" % "0.8.0")
addSbtPlugin("org.scalameta"     % "sbt-scalafmt"       % "2.5.0")

// Required for Tutorial
addSbtPlugin("com.typesafe.play" % "sbt-twirl" % "1.6.0-RC1") // sync with project/plugins.sbt

// Required for IDE docs
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "5.2.4")
