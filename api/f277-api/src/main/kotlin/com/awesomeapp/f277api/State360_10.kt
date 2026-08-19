package com.awesomeapp.f277api

sealed class State360_10 {
    data object Loading : State360_10()
    data class Success(val data: String) : State360_10()
    data class Error(val message: String) : State360_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
