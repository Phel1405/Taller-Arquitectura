package com.phel.architectureauth.screens

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.phel.architectureauth.navigation.AppScreens
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

data class LoginState(
    val email: String = "",
    val password: String = ""
)

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
@Composable
fun LoginScreen(navController: NavController, model: LoginViewModel = viewModel()){
    val user by model.loginState.collectAsState()

    Column(
        modifier = Modifier.fillMaxSize().padding(top = 20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
       TextField(
          value = user.email,
           onValueChange = {model.updateEmail(it)},
           label = {Text("email")},
           modifier = Modifier
               .fillMaxWidth()
               .padding(horizontal = 32.dp, vertical = 8.dp),
       )

        TextField(
            value = user.password,
            onValueChange = { model.updatePassword(it) },
            label = { Text("Contraseña") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp, vertical = 8.dp),
            visualTransformation = PasswordVisualTransformation()
        )

        Button(
            onClick = { login(model, user.email, user.password, navController) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp, vertical = 15.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF2196F3),
                contentColor = Color.White
            )
        ) {
            Text("Iniciar Sesión")
        }
    }
}

fun login(model: LoginViewModel, email: String, password: String, controller: NavController){
    val successful = true;
    if(successful){
        controller.navigate(AppScreens.HomeScreen.name)
    }else{
        Log.i("LogsAuth", "No se pudo autenticar")
    }
}
