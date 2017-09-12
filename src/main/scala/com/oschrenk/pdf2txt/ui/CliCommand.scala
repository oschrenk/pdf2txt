package com.oschrenk.pdf2txt.ui

import java.io.File

sealed trait CliCommand
case class ConvertCliCommand(input: File) extends CliCommand
