package ltd.hlaeja.library.accountRegistry

object Authentication {
    data class Request(
        val username: String,
        val password: CharSequence,
    )

    data class Response(
        val token: String,
    )
}
