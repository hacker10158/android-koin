package com.troywuma.koinsample.di

import com.troywuma.koinsample.Bird
import org.koin.dsl.module.module

val creatureModule = module {
    factory {
        Bird()
    }
}