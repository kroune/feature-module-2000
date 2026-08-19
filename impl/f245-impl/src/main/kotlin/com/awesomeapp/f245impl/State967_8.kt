package com.awesomeapp.f245impl

sealed class State967_8 {
    data object Loading : State967_8()
    data class Success(val data: String) : State967_8()
    data class Error(val message: String) : State967_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
