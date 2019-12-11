package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalculate.setOnClickListener(){
            textView7.text = getPremium().toString()
        }

        btnReset.setOnClickListener() {
            spinnerAge.setSelection(0)
            radioGroup.clearCheck()
            textView7.setText(" ")
            checkBox.setChecked(false)
        }

    }

   

    fun getPremium():Double{
        return when(spinnerAge.selectedItemPosition){
            0 -> 60.00
            1 -> 70.00 +
                    (if(radioButton.isChecked)50.00 else 0.0)+
                    (if(checkBox.isChecked)100.00 else 0.0)
            2 -> 90.00 +
                    (if(radioButton.isChecked)100.00 else 0.0)+
                    (if(checkBox.isChecked)150.00 else 0.0)

            3 -> 120.00 +
                    (if(radioButton.isChecked)150.00 else 0.0)+
                    (if(checkBox.isChecked)200.00 else 0.0)
            4 -> 150.00 +
                    (if(radioButton.isChecked)200.00 else 0.0)+
                    (if(checkBox.isChecked)250.00 else 0.0)
            else -> 150.00 +
                    (if(radioButton.isChecked)200.00 else 0.0)+
                    (if(checkBox.isChecked)300.00 else 0.0)
        }
    }
}
