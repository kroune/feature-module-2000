package com.awesomeapp.f54impl

sealed class State776_10 {
    data object Loading : State776_10()
    data class Success(val data: String) : State776_10()
    data class Error(val message: String) : State776_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
