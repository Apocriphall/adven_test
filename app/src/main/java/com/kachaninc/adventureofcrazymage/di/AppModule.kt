package com.kachaninc.adventureofcrazymage.di

import com.kachaninc.adventureofcrazymage.ui.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    viewModel { MainViewModel() }


}