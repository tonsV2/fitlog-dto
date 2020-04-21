package dk.fitfit.fitlog.dto

import java.time.LocalDateTime

data class RoundResponse(
    val priority: Int,
    val repetitions: Int,
    val rest: Int,
    val exercises: List<RoundExerciseResponse>?,
    val id: Long,
    val created: LocalDateTime?,
    val updated: LocalDateTime?
)