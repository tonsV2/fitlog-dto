package dk.fitfit.fitlog.dto

import java.time.LocalDateTime

data class WorkoutResponse(
    val name: String,
    val description: String,
    val rounds: List<RoundResponse>?,
    val creator: UserResponse,
    val id: Long,
    val created: LocalDateTime,
    val updated: LocalDateTime
)