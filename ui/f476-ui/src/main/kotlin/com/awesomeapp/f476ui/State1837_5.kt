package com.awesomeapp.f476ui

sealed class State1837_5 {
    data object Loading : State1837_5()
    data class Success(val data: String) : State1837_5()
    data class Error(val message: String) : State1837_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
