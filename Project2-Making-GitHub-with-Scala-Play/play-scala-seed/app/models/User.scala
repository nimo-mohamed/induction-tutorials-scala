package models

import play.api.libs.json.{Json, OFormat}

case class User(
                 username: String,
                 dateCreated: String,
                 location: Option[String],
                 followers: Int,
                 following: Int
               )

object User {
  implicit val format: OFormat[User] = Json.format[User]
}