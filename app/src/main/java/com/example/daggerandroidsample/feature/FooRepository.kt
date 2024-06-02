package com.example.daggerandroidsample.feature

import android.content.Context
import com.example.daggerandroidsample.ActivityScope
import com.example.daggerandroidsample.feature.Foo

import javax.inject.Inject

@ActivityScope
class FooRepository
@Inject
constructor(private val context: Context) {
    fun fetchFoos(): List<Foo> {
        return listOf()
    }
}
