package com.awesomeapp.audiocheckout

sealed class State244_59 {
    data object Loading : State244_59()
    data class Success(val data: String) : State244_59()
    data class Error(val message: String) : State244_59()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}