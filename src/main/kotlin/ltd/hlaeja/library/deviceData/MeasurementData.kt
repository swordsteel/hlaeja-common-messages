package ltd.hlaeja.library.deviceData

object MeasurementData {

    data class Request(
        val tags: Map<String, String>,
        val fields: Map<String, Number>,
    )

    data class Response(
        val fields: Map<String, Number>,
    )
}
