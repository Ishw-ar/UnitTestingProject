package com.example.unittestingproject

//don't need to create instance that's why created object class
object RegistrationUtil {

    private val existingUsers= listOf("varsha","Ishwar")

    /**
     *
     */

    fun validateRegistrationInput(userName: String, password: String,
    confirmPassword: String):Boolean{
        if (userName.isEmpty()||password.isEmpty()){
            return false
        }
        if (userName in existingUsers){
            return false
        }
        if (password!= confirmPassword){
            return false
        }
        if (password.count { it.isDigit()}<2){
            return false
        }
      return true
    }
}