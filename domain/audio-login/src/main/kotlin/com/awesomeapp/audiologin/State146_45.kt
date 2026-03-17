package com.awesomeapp.audiologin

sealed class State146_45 {
    data object Loading : State146_45()
    data class Success(val data: String) : State146_45()
    data class Error(val message: String) : State146_45()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}