package com.awesomeapp.documentlogin

sealed class State132_75 {
    data object Loading : State132_75()
    data class Success(val data: String) : State132_75()
    data class Error(val message: String) : State132_75()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}