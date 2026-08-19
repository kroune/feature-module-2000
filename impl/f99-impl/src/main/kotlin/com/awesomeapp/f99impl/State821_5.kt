package com.awesomeapp.f99impl

sealed class State821_5 {
    data object Loading : State821_5()
    data class Success(val data: String) : State821_5()
    data class Error(val message: String) : State821_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
