package com.example.gangelf.swoosh.Controler

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.gangelf.swoosh.Model.Player
import com.example.gangelf.swoosh.R
import com.example.gangelf.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        //Gets info passed from another activity
        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    fun onFinishedClicked(view: View) {

        if (player.skill != "") {
            val finishedActivity = Intent(this, FinishActivity::class.java)
            finishedActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishedActivity)
        } else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }
    }
    fun onBeginnerClicked(view: View) {
        ballerSkillBtn.isChecked = false

        player.skill = "beginner"
    }

    fun onBallerClicked(view: View) {
        beginnerSkillBtn.isChecked = false

        player.skill = "baller"
    }
}
