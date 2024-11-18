package ltd.hlaeja.library.deviceRegistry

import java.util.UUID

object Type {

    data class Request(
        val name: String,
    )

    data class Response(
        val id: UUID,
        val name: String,
    )
}
