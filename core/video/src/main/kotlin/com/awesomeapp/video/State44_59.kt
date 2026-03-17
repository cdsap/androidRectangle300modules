package com.awesomeapp.video

sealed class State44_59 {
    data object Loading : State44_59()
    data class Success(val data: String) : State44_59()
    data class Error(val message: String) : State44_59()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}