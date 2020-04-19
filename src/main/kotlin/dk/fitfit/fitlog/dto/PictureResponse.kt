package dk.fitfit.fitlog.dto

data class PictureResponse(
        val url: String,
        val creator: UserResponse,
        val id: Long
)
