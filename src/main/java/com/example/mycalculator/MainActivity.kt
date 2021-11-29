package com.example.mycalculator

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.mycalculator.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding : ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val ans : EditText = findViewById(R.id.ans)
        var solution = ans.text.toString().toFloat()


        fun changeValue(x: Float){
            if (ans.text.equals("0")) {

                ans.setText(solution.toString())

            }
            else{
                solution = (solution*10) + x
                ans.setText(solution.toString())
            }
        }
        binding.one.setOnClickListener {
            changeValue(1F)
        }
        binding.two.setOnClickListener {
            changeValue(2F)
        }
        binding.three.setOnClickListener {
            changeValue(3F)
        }
        binding.four.setOnClickListener {
            changeValue(4F)
        }
        binding.five.setOnClickListener {
            changeValue(5F)
        }
        binding.six.setOnClickListener {
            changeValue(6F)
        }
        binding.seven.setOnClickListener {
            changeValue(7F)
        }
        binding.eight.setOnClickListener {
            changeValue(8F)
        }
        binding.nine.setOnClickListener {
            changeValue(9F)
        }
        binding.zero.setOnClickListener {
            changeValue(0F)
        }

        binding.clear.setOnClickListener {
            ans.setText("0")
            solution = 0F
        }
        binding.plus.setOnClickListener {
            val temp : Float = solution
            solution = 0F
            ans.setText(solution.toString())

            binding.equal.setOnClickListener {
                solution += temp
                solution.toInt()
                ans.setText(solution.toString())
            }
        }
        binding.minus.setOnClickListener {
            val temp : Float = solution
            solution = 0F
            ans.setText(solution.toString())

            binding.equal.setOnClickListener {
                solution = temp - solution
                ans.setText(solution.toString())
            }
        }
        binding.multiply.setOnClickListener {
            val temp : Float = solution
            solution = 0F
            ans.setText(solution.toString())

            binding.equal.setOnClickListener {
                solution *= temp
                ans.setText(solution.toString())
            }
        }
        binding.divide.setOnClickListener {
            val temp : Float = solution
            solution = 0F
            ans.setText(solution.toString())

            binding.equal.setOnClickListener {
                solution = temp/solution
                ans.setText(solution.toString())
            }
        }
        binding.percentage.setOnClickListener {
            val temp : Float = solution
            solution = 0F
            solution.toInt()
            ans.setText(solution.toString())

            binding.equal.setOnClickListener {
                solution = (temp/solution)*100
                ans.setText(solution.toString())
            }
        }
        binding.plusMinus.setOnClickListener {
                solution -= (2 * solution)
                ans.setText(solution.toString())
        }
        binding.decimalPoint.setOnClickListener {
            val temp : Float = solution
            solution = 0F
            ans.setText(solution.toString())

            binding.equal.setOnClickListener {
                var len  = solution.toString().length
                var dec = 1
                while (len>2){
                    dec *= 10
                    len -= 1
                }
                solution = ((solution/dec) + temp)
                ans.setText(solution.toString())

            }
        }
    }




}