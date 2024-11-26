package ltd.hlaeja.library.deviceRegistry

import java.util.UUID

object Identity {

    data class Response(
        val client: UUID,
        val node: UUID,
        val device: UUID,
    )
}
