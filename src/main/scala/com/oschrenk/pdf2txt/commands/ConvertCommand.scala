package com.oschrenk.pdf2txt.commands

import java.io.File

import com.typesafe.scalalogging.LazyLogging

class ConvertCommand(path: File) extends LazyLogging  {
  def run(): String = {
    logger.info(s"Converting $path")
    "foo"
  }
}


