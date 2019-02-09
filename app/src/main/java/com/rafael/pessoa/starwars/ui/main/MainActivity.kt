package com.rafael.pessoa.starwars.ui.main


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import com.rafael.pessoa.githubaac.ui.userprofile.UserProfileFragment
import com.rafael.pessoa.starwars.R
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasFragmentInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject
import kotlin.text.Typography.dagger

class MainActivity : AppCompatActivity(), HasSupportFragmentInjector {

    @Inject
    lateinit var  dispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>

    override fun supportFragmentInjector(): AndroidInjector<Fragment> {
        return  dispatchingAndroidInjector
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpDragger()
        setupFragment()
    }

    private fun setUpDragger(){
        AndroidInjection.inject(this)
    }

    fun setupFragment(){
        supportFragmentManager
                .beginTransaction()
                .add(R.id.container, UserProfileFragment(), null)
                .commit()
    }

}
