package dk.fitfit.fitlog.dto

import java.time.LocalDateTime

data class UserResponse(
    val name: String,
    val created: LocalDateTime,
    val id: Long
)
