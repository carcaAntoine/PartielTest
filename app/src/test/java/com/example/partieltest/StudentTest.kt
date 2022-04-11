package com.example.partieltest

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class Student(name: String) : User(name) {
    private var students : MutableList<User>?= null;

    @Test
    fun addStudent(){
        assertThat(1, equalTo(students!!.size))
    }

    @Test
    fun deleteStudent(){
        assertThat(0, equalTo(students!!.size))
    }

    fun updateStudent(){

    }
}