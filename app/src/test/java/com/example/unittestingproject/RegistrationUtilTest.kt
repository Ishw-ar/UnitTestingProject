package com.example.unittestingproject


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest{

    @Test
    fun  `empty username returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123")
        assertThat(result).isFalse()
    }

    @Test
    fun  `valid username and correctly repeated password returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Ishwar",
            "123",
            "123")
        assertThat(result).isFalse()

    }



    @Test
    fun  `username already exists return false`(){

        val result = RegistrationUtil.validateRegistrationInput(
            "Ishwar",
            "123",
            "123")
        assertThat(result).isFalse()

    }

    @Test
    fun  `incorectly confirm password false`(){

        val result = RegistrationUtil.validateRegistrationInput(
            "Ishwar",
            "12345",
            "abcdefg")
        assertThat(result).isFalse()

    }

    @Test
    fun  `empty password return false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Ishwar",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun  `less than 2 digit password return false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Ishwar",
            "adncgrdd",
            "afgthse"

        )
        assertThat(result).isFalse()
    }
}