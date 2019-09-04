package com.hakivin.cptest

import java.util.*

/*
    problem from https://www.hackerrank.com/challenges/magic-square-forming/problem
 */

fun formingMagicSquare(s: Array<Array<Int>>): Int {
    return 0
}

fun main() {
    val scan = Scanner(System.`in`)

    val s = Array<Array<Int>>(3) { Array<Int>(3) { 0 } }

    for (i in 0 until 3) {
        s[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    }

    val result = formingMagicSquare(s)

    println(result)
}