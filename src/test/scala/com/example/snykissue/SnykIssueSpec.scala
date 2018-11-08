package com.example.snykissue

import org.scalatest._

class SnykIssueSpec extends FlatSpec with Matchers {
  val snykIssue = new SnykIssue()

  "greet" should "greet bob" in {
    snykIssue.greet("bob") shouldBe "hello, bob"
  }

}
