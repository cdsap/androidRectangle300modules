package com.awesomeapp.filecheckout

sealed class State229_69 {
    data object Loading : State229_69()
    data class Success(val data: String) : State229_69()
    data class Error(val message: String) : State229_69()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}