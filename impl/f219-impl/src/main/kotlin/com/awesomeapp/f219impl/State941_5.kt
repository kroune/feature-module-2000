package com.awesomeapp.f219impl

sealed class State941_5 {
    data object Loading : State941_5()
    data class Success(val data: String) : State941_5()
    data class Error(val message: String) : State941_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
