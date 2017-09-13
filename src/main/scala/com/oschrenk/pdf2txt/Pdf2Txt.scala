package com.oschrenk.pdf2txt

import com.oschrenk.pdf2txt.commands.ConvertCommand
import com.oschrenk.pdf2txt.ui.{CliParser, ConvertCliCommand, Settings}

object Pdf2Txt extends App {

  new CliParser().parser.parse(args, Settings.default) match {
    case Some(options) =>

      options.command match {
        case None => println("Noop")
        case Some(ConvertCliCommand(input)) =>
          println(new ConvertCommand(input).run().trim())
      }
    case None =>
      println("error parsing")
  }
}
