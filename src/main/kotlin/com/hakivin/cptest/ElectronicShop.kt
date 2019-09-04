package com.hakivin.cptest

/*
    problem from https://www.hackerrank.com/challenges/electronics-shop/problem
    SOLVED
 */

fun getMoneySpent(keyboards: Array<Int>, drives: Array<Int>, b: Int): Int {
    var max : Int = -1
    for (i in keyboards){
        for (j in drives){
            if (j+i in (max + 1)..b)
                max = j+i
        }
    }
    return max
}

fun main(){
    val keyboards = arrayOf(1,7,9)
    val drives = arrayOf(1,7,9)
    val b = 16
    println(getMoneySpent(keyboards, drives, b))
}