package com.rafael.pessoa.starwars


import android.app.Application
import android.app.Activity
import com.facebook.stetho.Stetho
import com.rafael.pessoa.githubaac.di.components.DaggerAppComponent
import dagger.android.DispatchingAndroidInjector
import javax.inject.Inject
import dagger.android.HasActivityInjector
import kotlin.text.Typography.dagger


class MyApp : Application(), HasActivityInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        this.initDagger()
        this.initStetho()
    }

    private fun initStetho()  {
        Stetho.initializeWithDefaults(this)
    }

    override fun activityInjector(): DispatchingAndroidInjector<Activity>? {
        return dispatchingAndroidInjector
    }

    private fun initDagger() {
        DaggerAppComponent.builder().application(this).build().inject(this)
    }
}
