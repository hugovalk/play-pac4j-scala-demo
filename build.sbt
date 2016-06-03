name := "play-pac4j-scala-demo"

version := "2.3.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  cache,
  ws,
  filters,
  specs2 % Test,
  "org.pac4j" % "play-pac4j" % "2.3.0-SNAPSHOT",
  "org.pac4j" % "pac4j-http" % "1.9.0-SNAPSHOT",
  "org.pac4j" % "pac4j-cas" % "1.9.0-SNAPSHOT",
  "org.pac4j" % "pac4j-openid" % "1.9.0-SNAPSHOT" exclude("xml-apis" , "xml-apis"),
  "org.pac4j" % "pac4j-oauth" % "1.9.0-SNAPSHOT",
  "org.pac4j" % "pac4j-saml" % "1.9.0-SNAPSHOT",
  "org.pac4j" % "pac4j-oidc" % "1.9.0-SNAPSHOT" exclude("commons-io" , "commons-io"),
  "org.pac4j" % "pac4j-gae" % "1.9.0-SNAPSHOT",
  "org.pac4j" % "pac4j-jwt" % "1.9.0-SNAPSHOT" exclude("commons-io" , "commons-io"),
  "org.pac4j" % "pac4j-ldap" % "1.9.0-SNAPSHOT",
  "org.pac4j" % "pac4j-sql" % "1.9.0-SNAPSHOT",
  "org.pac4j" % "pac4j-mongo" % "1.9.0-SNAPSHOT",
  "org.pac4j" % "pac4j-stormpath" % "1.9.0-SNAPSHOT",
  "com.typesafe.play" % "play-cache_2.11" % "2.4.6",
  "commons-io" % "commons-io" % "2.4"
)

resolvers ++= Seq(Resolver.mavenLocal, "Sonatype snapshots repository" at "https://oss.sonatype.org/content/repositories/snapshots/")

routesGenerator := InjectedRoutesGenerator

fork in run := true
