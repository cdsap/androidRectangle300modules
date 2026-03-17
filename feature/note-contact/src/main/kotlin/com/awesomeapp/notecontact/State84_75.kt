package com.awesomeapp.notecontact

sealed class State84_75 {
    data object Loading : State84_75()
    data class Success(val data: String) : State84_75()
    data class Error(val message: String) : State84_75()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}