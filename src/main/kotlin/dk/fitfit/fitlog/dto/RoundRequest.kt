package dk.fitfit.fitlog.dto

data class RoundRequest(
    val priority: Int,
    val repetitions: Int,
    val rest: Int,
    val id: Long
)