package com.awesomeapp.messagecart

sealed class State263_66 {
    data object Loading : State263_66()
    data class Success(val data: String) : State263_66()
    data class Error(val message: String) : State263_66()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}