package com.example.daggerandroidsample.feature

internal interface FeatureView {
    fun showFoos(id: String?, foos: List<Foo>)
}
