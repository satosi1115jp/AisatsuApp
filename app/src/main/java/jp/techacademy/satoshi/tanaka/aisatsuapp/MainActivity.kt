package jp.techacademy.satoshi.tanaka.aisatsuapp

import android.app.TimePickerDialog
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    val num1="おはよう"
    val num2="こんにちは"
    val num3="こんばんは"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        /*when (v.id)*/
        /*R.id.button1->*/
        showTimePickerDialog()
    }


    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
                this,
                TimePickerDialog.OnTimeSetListener { View, hour, minute ->
                    if (hour>1&&hour<10) {
                        textView.text=num1
                    } else if (hour>9&&hour<18){
                            textView.text=num2
                        }else {
                        textView.text = num3
                    }
                },
                0, 0, true)
        timePickerDialog.show()
    }




}
