package com.awesomeapp.taskcontact

sealed class State77_72 {
    data object Loading : State77_72()
    data class Success(val data: String) : State77_72()
    data class Error(val message: String) : State77_72()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}