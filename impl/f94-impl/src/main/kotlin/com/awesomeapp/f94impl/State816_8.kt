package com.awesomeapp.f94impl

sealed class State816_8 {
    data object Loading : State816_8()
    data class Success(val data: String) : State816_8()
    data class Error(val message: String) : State816_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
