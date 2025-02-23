addSbtPlugin("org.scalariform"  % "sbt-scalariform"      % "1.8.3")
addSbtPlugin("com.timushev.sbt" % "sbt-updates"          % "0.6.4")
addSbtPlugin("org.xerial.sbt"   % "sbt-sonatype"         % "3.9.15")
addSbtPlugin("com.github.sbt"     % "sbt-pgp"              % "2.2.1")
addSbtPlugin("com.localytics"   % "sbt-dynamodb"         % "2.0.3")

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")
