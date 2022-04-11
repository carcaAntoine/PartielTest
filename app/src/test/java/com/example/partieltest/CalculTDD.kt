package com.example.partieltest

//Exercice 2

import org.hamcrest.CoreMatchers.equalTo
import org.junit.Test
import org.hamcrest.MatcherAssert.assertThat

class CalculTDD {

    var calculs = Calcul();

    @Test
    fun add(){
        assertThat(calculs.calculAdd(1,2), equalTo(3))
    }

    @Test
    fun sub(){
        assertThat(calculs.calculSub(5,4), equalTo(1))
    }

    @Test
    fun div(){
        assertThat(calculs.calculDiv(8,4), equalTo(2))
    }

    @Test
    fun multiple(){
        assertThat(calculs.calculMultiple(5,4), equalTo(20))
    }
}