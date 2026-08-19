package com.awesomeapp.f254ui

sealed class State1615_7 {
    data object Loading : State1615_7()
    data class Success(val data: String) : State1615_7()
    data class Error(val message: String) : State1615_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
