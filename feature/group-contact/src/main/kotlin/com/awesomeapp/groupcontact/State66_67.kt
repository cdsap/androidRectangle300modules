package com.awesomeapp.groupcontact

sealed class State66_67 {
    data object Loading : State66_67()
    data class Success(val data: String) : State66_67()
    data class Error(val message: String) : State66_67()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}