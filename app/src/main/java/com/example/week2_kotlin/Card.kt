package com.example.week2_kotlin

class Card( private var rank:String,private var suit:String,  private var flip:Boolean=true) {
    fun printDetail()
    {
        if(flip)
        println("$rank $suit")
        else
        println(".......")
    }
    fun CardFlip()
    {
        flip=!flip
    }
}