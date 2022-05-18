package commons

import java.util.UUID
import scala.compiletime.{error, requireConst}

object Types:
  opaque type NonEmptyString <: String = String

  object NonEmptyString:
    private val errorMsg = "did not satisfy nonEmptyString()"

    def fromUUID(uuid: UUID): NonEmptyString = uuid.toString

    def apply(s: String): Either[String, NonEmptyString] =
      if s == "" then Left(errorMsg) else Right(s)

    inline def from(inline s: String): NonEmptyString =
      requireConst(s)
      inline if s == "" then error(errorMsg) else s
