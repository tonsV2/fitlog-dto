package dk.fitfit.fitlog.dto

import java.time.LocalDateTime

data class UserRequest(
        val created: LocalDateTime,
        val id: Long
)
