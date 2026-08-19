package com.awesomeapp.f493impl

sealed class State1215_8 {
    data object Loading : State1215_8()
    data class Success(val data: String) : State1215_8()
    data class Error(val message: String) : State1215_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
