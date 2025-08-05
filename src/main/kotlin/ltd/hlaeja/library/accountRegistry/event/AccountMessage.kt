package ltd.hlaeja.library.accountRegistry.event

import java.util.UUID

data class AccountMessage(
    val userId: UUID,
    val change: List<String>,
    val timestamp: Long = System.currentTimeMillis(),
)
