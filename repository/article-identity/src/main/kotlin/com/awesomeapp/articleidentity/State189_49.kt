package com.awesomeapp.articleidentity

sealed class State189_49 {
    data object Loading : State189_49()
    data class Success(val data: String) : State189_49()
    data class Error(val message: String) : State189_49()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}