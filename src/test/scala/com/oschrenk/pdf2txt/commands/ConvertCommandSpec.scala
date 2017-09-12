package com.oschrenk.pdf2txt.commands

import java.io.File

import org.scalatest._

class ConvertCommandSpec extends FlatSpec with Matchers {

  "ConvertCommand" should "return foo" in {
    val pdfFile = new File(getClass.getResource("/foo.pdf").getPath())
    val text = new ConvertCommand(pdfFile).run()
    text shouldBe "foo\n"
  }
}
