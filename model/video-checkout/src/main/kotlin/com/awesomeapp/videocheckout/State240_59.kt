package com.awesomeapp.videocheckout

sealed class State240_59 {
    data object Loading : State240_59()
    data class Success(val data: String) : State240_59()
    data class Error(val message: String) : State240_59()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}