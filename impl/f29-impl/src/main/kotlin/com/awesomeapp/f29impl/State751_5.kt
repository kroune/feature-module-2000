package com.awesomeapp.f29impl

sealed class State751_5 {
    data object Loading : State751_5()
    data class Success(val data: String) : State751_5()
    data class Error(val message: String) : State751_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
