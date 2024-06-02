package com.example.daggerandroidsample.feature

import com.example.daggerandroidsample.ActivityScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FeatureActivityModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = [FeatureModule::class])
    abstract fun contributeFeatureActivityInjector(): FeatureActivity
}