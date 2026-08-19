package com.awesomeapp.f529impl

sealed class State1251_6 {
    data object Loading : State1251_6()
    data class Success(val data: String) : State1251_6()
    data class Error(val message: String) : State1251_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
