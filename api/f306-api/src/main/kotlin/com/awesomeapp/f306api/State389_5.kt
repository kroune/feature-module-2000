package com.awesomeapp.f306api

sealed class State389_5 {
    data object Loading : State389_5()
    data class Success(val data: String) : State389_5()
    data class Error(val message: String) : State389_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
