package dk.fitfit.fitlog.dto

import java.time.LocalDateTime

data class UserResponse(
        val created: LocalDateTime,
        val id: Long
)
