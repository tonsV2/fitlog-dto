package dk.fitfit.fitlog.dto

import java.time.LocalDateTime

data class RoundExerciseResponse(
    val exercise: ExerciseResponse,
    val repetitions: Int,
    val maxTime: Int,
    val priority: Int,
    val id: Long,
    val created: LocalDateTime,
    val updated: LocalDateTime
)