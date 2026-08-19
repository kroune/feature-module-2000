package com.awesomeapp.f546api

sealed class State629_8 {
    data object Loading : State629_8()
    data class Success(val data: String) : State629_8()
    data class Error(val message: String) : State629_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
