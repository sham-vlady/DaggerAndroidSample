package com.example.daggerandroidsample.feature

import com.example.daggerandroidsample.ActivityScope

import javax.inject.Inject
import javax.inject.Named

@ActivityScope
internal class FeaturePresenter
@Inject constructor(private val featureView: FeatureView,
                    @Named("someId") private val someId: String?,
                    private val fooRepository: FooRepository
) {

    fun onStart() {
        val foos = fooRepository.fetchFoos()
        featureView.showFoos(someId, foos)
    }
}
