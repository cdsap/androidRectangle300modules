package com.awesomeapp.audiocheckout

sealed class State244_53 {
    data object Loading : State244_53()
    data class Success(val data: String) : State244_53()
    data class Error(val message: String) : State244_53()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}