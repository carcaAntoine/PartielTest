package com.example.partieltest

//Exercice 1

import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertNotNull
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class UserTest {

    private var users : MutableList<`Users`>? = null

    @Before
    fun setup() {
        users = mutableListOf()
    }

    @Test
    fun addUser(){
        users?.add(`Users`(1, "Paul", 21))
        assertNotNull(users)
    }

    @Test
    fun deleteUser(){
        users?.remove(`Users`(1, "Paul", 21))
        Assert.assertEquals(0, users!!.size)
    }

    @Test
    fun updateUser(){
        users!![0].name = "Laura"
        users!![0].age = 32
        assertEquals("Laura", users!![0].name)
        assertEquals(32, users!![0].age)
    }
}