package com.example.daggerandroidsample

import com.example.daggerandroidsample.feature.FeatureActivityModule
import dagger.Module

@Module(includes = [FeatureActivityModule::class])
internal abstract class ContributeActivityModule