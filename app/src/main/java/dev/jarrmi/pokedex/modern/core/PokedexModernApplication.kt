package dev.jarrmi.pokedex.modern.core

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class PokedexModernApplication : Application() {

    override fun onCreate() {
        super.onCreate()
    }
}
