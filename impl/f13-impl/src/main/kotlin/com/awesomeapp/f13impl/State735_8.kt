package com.awesomeapp.f13impl

sealed class State735_8 {
    data object Loading : State735_8()
    data class Success(val data: String) : State735_8()
    data class Error(val message: String) : State735_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
