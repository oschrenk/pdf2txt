package com.oschrenk.pdf2txt.ui

case object Settings {
  val default = Settings(None)
}
case class Settings(command: Option[CliCommand])


