package com.awesomeapp.f415ui

sealed class State1776_10 {
    data object Loading : State1776_10()
    data class Success(val data: String) : State1776_10()
    data class Error(val message: String) : State1776_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
