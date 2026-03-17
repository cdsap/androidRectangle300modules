package com.awesomeapp.videocheckout

sealed class State240_38 {
    data object Loading : State240_38()
    data class Success(val data: String) : State240_38()
    data class Error(val message: String) : State240_38()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}