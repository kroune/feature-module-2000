package com.awesomeapp.f197impl

sealed class State919_5 {
    data object Loading : State919_5()
    data class Success(val data: String) : State919_5()
    data class Error(val message: String) : State919_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
