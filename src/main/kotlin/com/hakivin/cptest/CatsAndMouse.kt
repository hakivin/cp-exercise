package com.hakivin.cptest

import java.util.*

/*
    problem from https://www.hackerrank.com/challenges/cats-and-a-mouse/problem
    SOLVED
 */

fun catAndMouse(x: Int, y: Int, z: Int): String {
    val disA = getDistance(x,z)
    val disB = getDistance(y,z)
    return when {
        disA == disB -> "Mouse C"
        disA > disB -> "Cat B"
        else -> "Cat A"
    }
}

private fun getDistance(x : Int, y : Int) : Int {
    return if (x > y)
        x - y
    else
        y - x
}

fun main(){
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val xyz = scan.nextLine().split(" ")

        val x = xyz[0].trim().toInt()

        val y = xyz[1].trim().toInt()

        val z = xyz[2].trim().toInt()

        val result = catAndMouse(x, y, z)

        println(result)
    }
}