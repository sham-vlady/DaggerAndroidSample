package com.example.daggerandroidsample.feature

import android.os.Bundle
import com.example.daggerandroidsample.R
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject


@Suppress("MemberVisibilityCanBePrivate")
class FeatureActivity : DaggerAppCompatActivity(), FeatureView {
    @Inject
    internal lateinit var presenter: FeaturePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.feature_activity)
    }

    override fun onStart() {
        super.onStart()
        presenter.onStart()
    }

    override fun showFoos(id: String?, foos: List<Foo>) {
        // Called by the presenter to show Foos
    }

    companion object {
        const val EXTRA_SOME_ID = "some_id"
    }
}
