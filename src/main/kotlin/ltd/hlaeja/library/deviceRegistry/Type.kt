package ltd.hlaeja.library.deviceRegistry

import java.time.ZonedDateTime
import java.util.UUID

object Type {

    data class Request(
        val name: String,
        val description: String,
    )

    data class Response(
        val id: UUID,
        val timestamp: ZonedDateTime,
        val name: String,
        val description: String,
    )
}
