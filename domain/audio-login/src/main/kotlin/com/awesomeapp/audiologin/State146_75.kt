package com.awesomeapp.audiologin

sealed class State146_75 {
    data object Loading : State146_75()
    data class Success(val data: String) : State146_75()
    data class Error(val message: String) : State146_75()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}