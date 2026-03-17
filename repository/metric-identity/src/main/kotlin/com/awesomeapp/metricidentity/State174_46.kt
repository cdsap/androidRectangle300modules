package com.awesomeapp.metricidentity

sealed class State174_46 {
    data object Loading : State174_46()
    data class Success(val data: String) : State174_46()
    data class Error(val message: String) : State174_46()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}