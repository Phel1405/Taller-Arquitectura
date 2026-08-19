package com.phel.architectureauth.viewmodel

import androidx.lifecycle.ViewModel
import com.phel.architectureauth.screens.LoginState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class LoginViewModel: ViewModel(){
    private val _loginState = MutableStateFlow(LoginState())
    val loginState = _loginState.asStateFlow()

    fun updateEmail(newValue: String){
        _loginState.value = _loginState.value.copy(email = newValue)
    }

    fun updatePassword(newValue: String){
        _loginState.value = _loginState.value.copy(password = newValue)
    }
}
