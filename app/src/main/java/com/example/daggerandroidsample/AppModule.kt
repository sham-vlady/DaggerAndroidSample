package com.example.daggerandroidsample

import android.content.Context
import dagger.Binds
import dagger.Module

@Module
internal abstract class AppModule {
    @Binds
    abstract fun provideContext(application: App): Context
}