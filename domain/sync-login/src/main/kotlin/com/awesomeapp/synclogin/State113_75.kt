package com.awesomeapp.synclogin

sealed class State113_75 {
    data object Loading : State113_75()
    data class Success(val data: String) : State113_75()
    data class Error(val message: String) : State113_75()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}