package org.wit.charityeventapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import timber.log.Timber

class CharitymarkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_charitymark)

        Timber.plant(Timber.DebugTree())

        Timber.i("Charity app Activity started..")
    }
}