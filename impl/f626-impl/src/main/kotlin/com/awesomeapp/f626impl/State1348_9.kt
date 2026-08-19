package com.awesomeapp.f626impl

sealed class State1348_9 {
    data object Loading : State1348_9()
    data class Success(val data: String) : State1348_9()
    data class Error(val message: String) : State1348_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
