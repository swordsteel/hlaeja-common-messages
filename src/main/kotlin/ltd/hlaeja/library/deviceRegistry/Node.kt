package ltd.hlaeja.library.deviceRegistry

import java.util.UUID

object Node {

    data class Request(
        val client: UUID,
        val device: UUID,
        val name: String,
    )

    data class Response(
        val id: UUID,
        val client: UUID,
        val device: UUID,
        val name: String,
    )
}
