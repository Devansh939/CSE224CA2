package com.example.cse224ca2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioGroup
import android.widget.RadioButton
import android.widget.Toast

class SetB_Ques2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.setb_q2)
        val radioGender = findViewById<RadioGroup>(R.id.select_gender)
        val ageCheck = findViewById<CheckBox>(R.id.checkbox1)

        //Display Toast for Radio Button
        if(radioGender.isSelected){
            radioGender.clearCheck()
        }
        radioGender.setOnCheckedChangeListener{group, checkedID ->
            val setRadio: RadioButton = group.findViewById(checkedID)
            Toast.makeText(applicationContext, setRadio.text.toString(), Toast.LENGTH_SHORT).show()
        }

        //Display Toast for Checkbox
        ageCheck.setOnClickListener{
            if(ageCheck.isChecked)
                Toast.makeText(applicationContext, ageCheck.text.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}