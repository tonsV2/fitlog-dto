package dk.fitfit.fitlog.dto

data class RoundExerciseRequest(
    val exerciseId: Long,
    val repetitions: Int,
    val maxTime: Int,
    val priority: Int,
    val id: Long = 0
)