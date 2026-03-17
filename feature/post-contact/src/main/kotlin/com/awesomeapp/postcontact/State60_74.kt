package com.awesomeapp.postcontact

sealed class State60_74 {
    data object Loading : State60_74()
    data class Success(val data: String) : State60_74()
    data class Error(val message: String) : State60_74()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}