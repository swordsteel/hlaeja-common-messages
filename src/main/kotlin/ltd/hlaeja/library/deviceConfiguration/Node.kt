package ltd.hlaeja.library.deviceConfiguration

import java.time.ZonedDateTime
import java.util.UUID

object Node {

    data class Request(
        val configuration: String,
    )

    data class Response(
        val node: UUID,
        val timestamp: ZonedDateTime,
        val configuration: String,
    )
}
