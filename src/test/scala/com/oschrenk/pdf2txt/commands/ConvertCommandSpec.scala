package com.oschrenk.pdf2txt.commands

import java.io.File

import org.scalatest._

class ConvertCommandSpec extends FlatSpec with Matchers {

  "ConvertCommand" should "return foo" in {
    val text = new ConvertCommand(new File("test")).run()
    text shouldBe "foo"
  }
}
