package ltd.hlaeja.library.deviceRegistry

import java.time.ZonedDateTime
import java.util.UUID

object Devices {

    data class Response(
        val id: UUID,
        val type: UUID,
        val timestamp: ZonedDateTime,
    )
}
