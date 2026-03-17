package com.awesomeapp.feedlogin

sealed class State107_75 {
    data object Loading : State107_75()
    data class Success(val data: String) : State107_75()
    data class Error(val message: String) : State107_75()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}