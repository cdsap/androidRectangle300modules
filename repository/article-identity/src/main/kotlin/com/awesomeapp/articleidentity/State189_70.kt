package com.awesomeapp.articleidentity

sealed class State189_70 {
    data object Loading : State189_70()
    data class Success(val data: String) : State189_70()
    data class Error(val message: String) : State189_70()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}