import mill._
import mill.scalalib._
import mill.scalalib.publish._

object vega extends ScalaModule with PublishModule {
  def publishVersion = "1.0.0"
  def scalaVersion = "2.12.15"

  override def pomSettings = PomSettings(
    description = "Vizier Vega/Vega-Lite Support",
    organization = "info.vizierdb",
    url = "http://vizierdb.info",
    licenses = Seq(License.`Apache-2.0`),
    versionControl = VersionControl.github("vizierdb", "vizier-scala"),
    developers = Seq(
      Developer("okennedy", "Oliver Kennedy", "https://odin.cse.buffalo.edu"),
    )
  )
  def ivyDeps = Agg(
    ivy"com.typesafe.play::play-json:2.9.2"
  )
}