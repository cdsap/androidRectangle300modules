package com.awesomeapp.articleidentity

sealed class State189_52 {
    data object Loading : State189_52()
    data class Success(val data: String) : State189_52()
    data class Error(val message: String) : State189_52()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}