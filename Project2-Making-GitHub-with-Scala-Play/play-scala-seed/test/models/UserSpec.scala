package models

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class UserSpec extends AnyWordSpec with Matchers {

  private val user = User(
    username = "nimo",
    dateCreated = "2026-10-27",
    location = Some("Manchester"),
    followers = 100,
    following = 50
  )

  "User" should {

    "store the correct username" in {
      user.username shouldBe "nimo"
    }

    "store the correct date created" in {
      user.dateCreated shouldBe "2026-10-27"
    }

    "store the correct location" in {
      user.location shouldBe Some("Manchester")
    }

    "store the correct followers count" in {
      user.followers shouldBe 100
    }

    "store the correct following count" in {
      user.following shouldBe 50
    }
  }
}