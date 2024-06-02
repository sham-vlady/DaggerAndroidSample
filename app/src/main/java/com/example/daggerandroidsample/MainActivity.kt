package com.example.daggerandroidsample

import android.app.Activity
import android.content.Intent
import android.os.Bundle

import com.example.daggerandroidsample.feature.FeatureActivity

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startFeatureActivity()
    }

    private fun startFeatureActivity() {
        val intent = Intent(this, FeatureActivity::class.java)
        intent.putExtra(FeatureActivity.EXTRA_SOME_ID, "id_1")
        startActivity(intent)
    }
}
