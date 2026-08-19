package com.awesomeapp.f155impl

sealed class State877_8 {
    data object Loading : State877_8()
    data class Success(val data: String) : State877_8()
    data class Error(val message: String) : State877_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
