package com.oschrenk.pdf2txt.commands

import java.io.File

import com.typesafe.scalalogging.LazyLogging
import org.apache.pdfbox.pdmodel.PDDocument
import org.apache.pdfbox.text.PDFTextStripper

class ConvertCommand(pdf: File) extends LazyLogging  {
  def run(): String = {
    logger.info(s"Converting $pdf")
    val doc = PDDocument.load(pdf)
    val text = new PDFTextStripper().getText(doc)
    doc.close()
    text
  }
}


