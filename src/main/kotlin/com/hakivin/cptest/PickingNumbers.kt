package com.hakivin.cptest

/*
    problem from https://www.hackerrank.com/challenges/picking-numbers/problem
    SOLVED
 */

fun pickingNumbers(a: Array<Int>): Int {
    a.sort()
    var maxLength = 0
    for (i in a.indices){
        for (j in a.lastIndex downTo i){
            var diff = a[j] - a[i]
            if (diff < 2){
                if (j - i + 1 > maxLength) {
                    maxLength = (j - i) + 1
                }
                break
            }
        }
    }
    return maxLength
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = pickingNumbers(a)

    println(result)
}