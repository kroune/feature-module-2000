package com.awesomeapp.f144impl

sealed class State866_5 {
    data object Loading : State866_5()
    data class Success(val data: String) : State866_5()
    data class Error(val message: String) : State866_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
