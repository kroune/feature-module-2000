package com.awesomeapp.f119impl

sealed class State841_5 {
    data object Loading : State841_5()
    data class Success(val data: String) : State841_5()
    data class Error(val message: String) : State841_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
