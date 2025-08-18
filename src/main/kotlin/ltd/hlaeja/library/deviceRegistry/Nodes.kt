package ltd.hlaeja.library.deviceRegistry

import java.time.ZonedDateTime
import java.util.UUID

object Nodes {

    data class Response(
        val id: UUID,
        val timestamp: ZonedDateTime,
        val client: UUID,
        val device: UUID,
        val name: String,
    )
}
