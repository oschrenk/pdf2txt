package com.oschrenk.pdf2txt.ui

import java.io.File

import scopt.OptionParser

class CliParser {

  val parser = new OptionParser[Settings]("pdf2txt") {
    head("pdf2txt")

    cmd("convert").text("convert given path to txt")
      .children(
        arg[File]("<file>...")
          .required()
          .action( (file, c) => c.copy(command = Some(ConvertCliCommand(file) )))
          .text("required input"))
  }
}
