import sbt._
import sbt.plugins.JvmPlugin

object SettingsPlugin extends AutoPlugin {
  override def trigger: PluginTrigger = AllRequirements
  override def requires: Plugins = JvmPlugin

  object autoImport {
    val jacksonVersion = "2.9.7"
  }
}