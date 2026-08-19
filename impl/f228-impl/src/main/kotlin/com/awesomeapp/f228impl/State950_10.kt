package com.awesomeapp.f228impl

sealed class State950_10 {
    data object Loading : State950_10()
    data class Success(val data: String) : State950_10()
    data class Error(val message: String) : State950_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
