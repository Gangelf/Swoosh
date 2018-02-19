package com.example.gangelf.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SkillActivity : BaseActivity() {

    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        //Gets info passed from another activity
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }
}
