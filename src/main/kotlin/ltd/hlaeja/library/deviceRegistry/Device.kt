package ltd.hlaeja.library.deviceRegistry

import java.util.UUID

object Device {

    data class Request(
        val type: UUID,
    )

    data class Response(
        val id: UUID,
        val type: UUID,
    )

    data class Identity(
        val identity: String,
    )
}
