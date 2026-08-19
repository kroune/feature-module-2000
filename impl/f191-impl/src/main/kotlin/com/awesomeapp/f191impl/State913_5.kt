package com.awesomeapp.f191impl

sealed class State913_5 {
    data object Loading : State913_5()
    data class Success(val data: String) : State913_5()
    data class Error(val message: String) : State913_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
