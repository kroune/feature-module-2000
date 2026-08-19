package com.awesomeapp.f164impl

sealed class State886_8 {
    data object Loading : State886_8()
    data class Success(val data: String) : State886_8()
    data class Error(val message: String) : State886_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
