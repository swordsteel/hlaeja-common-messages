package ltd.hlaeja.library.deviceRegistry

import java.io.Serializable
import java.util.UUID

object Identity {

    data class Response(
        val client: UUID,
        val node: UUID,
        val device: UUID,
    ) : Serializable {
        companion object {
            @Suppress("ConstPropertyName")
            private const val serialVersionUID = 1L
        }
    }
}
