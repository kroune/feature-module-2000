package com.awesomeapp.f147impl

sealed class State869_5 {
    data object Loading : State869_5()
    data class Success(val data: String) : State869_5()
    data class Error(val message: String) : State869_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
