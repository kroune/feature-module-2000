package com.awesomeapp.f433impl

sealed class State1155_8 {
    data object Loading : State1155_8()
    data class Success(val data: String) : State1155_8()
    data class Error(val message: String) : State1155_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
