package com.example.myapplicationkk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var keep = 0
    var tt = ""
    var num = 0
    var total = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        one.setOnClickListener() {
            if (number.text.toString() == "0" || keep == 1) {
                number.setText("1")
                keep = 0
            } else {
                var s1 = number.text.toString().plus(1)
                number.setText(s1)
            }
        }
        two.setOnClickListener() {
            if (number.text.toString() == "0" || keep == 1) {
                number.setText("2")
                keep = 0
            } else {
                var s2 = number.text.toString().plus(2)
                number.setText(s2)
            }

        }
        three.setOnClickListener() {
            if (number.text.toString() == "0" || keep == 1) {
                number.setText("3")
                keep = 0
            } else {
                var s3 = number.text.toString().plus(3)
                number.setText(s3)
            }

        }
        four.setOnClickListener() {
            if (number.text.toString() == "0" || keep == 1) {
                number.setText("4")
                keep = 0
            } else {
                var s4 = number.text.toString().plus(4)
                number.setText(s4)
            }

        }
        five.setOnClickListener() {
            if (number.text.toString() == "0" || keep == 1) {
                number.setText("5")
                keep = 0
            } else {
                var s5 = number.text.toString().plus(5)
                number.setText(s5)
            }

        }
        six.setOnClickListener() {
            if (number.text.toString() == "0" || keep == 1) {
                number.setText("6")
                keep = 0
            } else {
                var s6 = number.text.toString().plus(6)
                number.setText(s6)
            }

        }
        seven.setOnClickListener() {
            if (number.text.toString() == "0" || keep == 1) {
                number.setText("7")
                keep = 0
            } else {
                var s7 = number.text.toString().plus(7)
                number.setText(s7)
            }

        }
        eight.setOnClickListener() {
            if (number.text.toString() == "0" || keep == 1) {
                number.setText("8")
                keep = 0
            } else {
                var s8 = number.text.toString().plus(8)
                number.setText(s8)
            }

        }
        nine.setOnClickListener() {
            if (number.text.toString() == "0" || keep == 1) {
                number.setText("9")
                keep = 0
            } else {
                var s9 = number.text.toString().plus(9)
                number.setText(s9)
            }

        }
        zero.setOnClickListener() {
            if (number.text.toString() == "0" || keep == 1) {
                number.setText("0")
                keep = 0
            } else {
                var s0 = number.text.toString().plus(0)
                number.setText(s0)
            }

        }
        b1.setOnClickListener() {
            if (number.text.toString() == "0") {
                number.setText("0")
            } else {
                var s0 = number.text.toString().plus(0)
                number.setText(s0)
            }

        }

        clear.setOnClickListener()
        {
            number.setText("0")
        }
        del.setOnClickListener()
        {
            if (number.text.toString().length <= 1) {
                number.setText("0")
            } else {
                number.text = number.text.dropLast(1)
            }
        }
        plus.setOnClickListener()
        {
            keep = 1
            num = number.text.toString().toInt()
            tt = "plus"
        }
        equa.setOnClickListener()
        {
            if (tt == "plus") {
                total = num + number.text.toString().toInt()
                number.text = total.toString()
            }
        }
        minus.setOnClickListener()
        {
            keep = 1
            num = number.text.toString().toInt()
            tt = "minus"
        }
        equa.setOnClickListener()
        {
            if (tt == "minus") {
                total = num - number.text.toString().toInt()
                number.text = total.toString()
            }
        }
        mul.setOnClickListener()
        {
            keep = 1
            num = number.text.toString().toInt()
            tt = "mul"
        }
        equa.setOnClickListener()
        {
            if (tt == "mul") {
                total = num * number.text.toString().toInt()
                number.text = total.toString()
            }
        }
        divide.setOnClickListener()
        {
            keep = 1
            num = number.text.toString().toInt()
            tt = "di"
        }
        equa.setOnClickListener()
        {
            if (tt == "di") {
                total = num / number.text.toString().toInt()
                number.text = total.toString()
            }
        }
        mod.setOnClickListener(){
            if(tt=="di"){
                total = num % number.text.toString().toInt()
                number.text = total.toString()
            }
        }
        equa.setOnClickListener(){
            if(tt == "plus") {
                total = num + number.text.toString().toInt()
                number.setText(total.toString())
            }
            else if (tt == "minus"){
                total = num - number.text.toString().toInt()
                number.setText(total.toString())

            }
            else if (tt == "mul"){
                total = num * number.text.toString().toInt()
                number.setText(total.toString())
            }
            else if (tt == "div"){
                total = num / number.text.toString().toInt()
                number.setText(total.toString())
            }
            else if (tt == "mod"){
                total = num % number.text.toString().toInt()
                number.setText(total.toString())
            }
        }
    }
}

