package com.example.gangelf.swoosh.Controler

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.gangelf.swoosh.Utilities.EXTRA_LEAGUE
import com.example.gangelf.swoosh.R
import com.example.gangelf.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var selectedSkill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        //Gets info passed from another activity
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }

    fun onFinishedClicked(view: View) {

        if (selectedSkill != "") {
            val finishedActivity = Intent(this, FinishActivity::class.java)
            finishedActivity.putExtra(EXTRA_SKILL, selectedSkill)
            finishedActivity.putExtra(EXTRA_LEAGUE, league)
            startActivity(finishedActivity)
        } else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }
    }
    fun onBeginnerClicked(view: View) {
        ballerSkillBtn.isChecked = false

        selectedSkill = "beginner"
    }

    fun onBallerClicked(view: View) {
        beginnerSkillBtn.isChecked = false

        selectedSkill = "baller"
    }
}
