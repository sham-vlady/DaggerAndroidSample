package com.example.daggerandroidsample.feature

import com.example.daggerandroidsample.ActivityScope
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
internal abstract class FeatureModule {
    @ActivityScope
    @Binds
    abstract fun provideFeatureView(featureActivity: FeatureActivity): FeatureView

    companion object {
        @ActivityScope
        @Provides
        @Named("someId")
        fun provideSomeId(featureActivity: FeatureActivity): String? {
            return featureActivity.intent.getStringExtra(FeatureActivity.EXTRA_SOME_ID)
        }
    }
}