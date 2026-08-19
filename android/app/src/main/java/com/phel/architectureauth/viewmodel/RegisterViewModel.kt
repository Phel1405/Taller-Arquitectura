package com.phel.architectureauth.viewmodel

import androidx.lifecycle.ViewModel
import com.phel.architectureauth.screens.RegisterState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class RegisterViewModel: ViewModel(){
    private val _registerState = MutableStateFlow(RegisterState())
    val registerState = _registerState.asStateFlow()

    fun updateEmail(newValue: String){
        _registerState.value = _registerState.value.copy(email = newValue)
    }

    fun updatePassword(newValue: String){
        _registerState.value = _registerState.value.copy(password = newValue)
    }

    fun updateUsername(newValue: String){
        _registerState.value = _registerState.value.copy(username = newValue)
    }

    fun updateNombre(newValue: String){
        _registerState.value = _registerState.value.copy(nombre = newValue)
    }

    fun updateApellido(newValue: String){
        _registerState.value = _registerState.value.copy(apellido = newValue)
    }

    fun updateCedula(newValue: String){
        _registerState.value = _registerState.value.copy(cedula = newValue)
    }
}
