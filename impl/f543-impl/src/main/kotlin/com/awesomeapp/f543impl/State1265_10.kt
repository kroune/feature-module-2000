package com.awesomeapp.f543impl

sealed class State1265_10 {
    data object Loading : State1265_10()
    data class Success(val data: String) : State1265_10()
    data class Error(val message: String) : State1265_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
