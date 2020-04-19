package dk.fitfit.fitlog.dto

data class VideoResponse(
        val url: String,
        val creator: UserResponse,
        val id: Long
)
