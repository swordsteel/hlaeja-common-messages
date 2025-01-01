package ltd.hlaeja.library.accountRegistry

import java.time.ZonedDateTime
import java.util.UUID

object Account {

    data class Request(
        val username: String,
        val password: CharSequence,
        val enabled: Boolean,
        val roles: List<String>,
    )

    data class Response(
        val id: UUID,
        val timestamp: ZonedDateTime,
        val enabled: Boolean,
        val username: String,
        val roles: List<String>,
    )
}
