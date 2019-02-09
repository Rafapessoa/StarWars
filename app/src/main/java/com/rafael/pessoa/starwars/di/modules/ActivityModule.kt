package com.rafael.pessoa.githubaac.di.modules

import com.rafael.pessoa.starwars.ui.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityModule{

    @ContributesAndroidInjector(modules = [FragmentModules::class])
    abstract fun contributeMainActivity() : MainActivity
}