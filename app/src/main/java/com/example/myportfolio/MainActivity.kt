package com.example.myportfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val and var
        val buttonSkills= findViewById<Button>(R.id.btnSkills)
        val buttonEdu= findViewById<Button>(R.id.btnEducation)
        val buttonWork= findViewById<Button>(R.id.btnWork)
        val buttonAchi= findViewById<Button>(R.id.btnAchievment)

        buttonSkills.setOnClickListener{

            intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }
        buttonEdu.setOnClickListener{
            intent = Intent(this, EducationActivity::class.java)
            startActivity(intent)
        }
        buttonWork.setOnClickListener{
            intent = Intent(this, WorkActivity::class.java)
            startActivity(intent)
        }
        buttonAchi.setOnClickListener{
            intent = Intent(this, AchievmentActivity::class.java)
            startActivity(intent)
        }
    }
}