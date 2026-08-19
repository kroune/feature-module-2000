package com.awesomeapp.f596api

sealed class State679_5 {
    data object Loading : State679_5()
    data class Success(val data: String) : State679_5()
    data class Error(val message: String) : State679_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
