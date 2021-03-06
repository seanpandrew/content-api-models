addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.1")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.0.0")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "0.5.1")

resolvers += "twitter-repo" at "https://maven.twttr.com"
addSbtPlugin("com.twitter" % "scrooge-sbt-plugin" % "4.18.0")

addSbtPlugin("pl.project13.scala" % "sbt-jmh" % "0.2.7")
