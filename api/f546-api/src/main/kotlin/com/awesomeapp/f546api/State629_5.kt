package com.awesomeapp.f546api

sealed class State629_5 {
    data object Loading : State629_5()
    data class Success(val data: String) : State629_5()
    data class Error(val message: String) : State629_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
