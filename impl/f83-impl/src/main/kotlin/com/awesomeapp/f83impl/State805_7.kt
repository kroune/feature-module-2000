package com.awesomeapp.f83impl

sealed class State805_7 {
    data object Loading : State805_7()
    data class Success(val data: String) : State805_7()
    data class Error(val message: String) : State805_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
