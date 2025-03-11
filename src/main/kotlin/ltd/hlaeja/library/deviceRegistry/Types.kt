package ltd.hlaeja.library.deviceRegistry

import java.time.ZonedDateTime
import java.util.UUID

object Types {

    data class Response(
        val id: UUID,
        val name: String,
        val timestamp: ZonedDateTime,
    )
}
