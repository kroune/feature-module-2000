package com.awesomeapp.f371api

sealed class State454_8 {
    data object Loading : State454_8()
    data class Success(val data: String) : State454_8()
    data class Error(val message: String) : State454_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
