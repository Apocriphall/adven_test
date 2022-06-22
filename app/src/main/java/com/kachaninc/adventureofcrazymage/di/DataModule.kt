package com.kachaninc.magicalstupidity.di

import org.koin.dsl.module

val dataModule = module {

//    single { provideAppDatabase(androidContext()) }
//    single { provideSpreadResultDao(get()) }
//    single { provideSpreadResultRepository(get()) }
}

//fun provideAppDatabase(context: Context): JournalDatabase {
//    return JournalDatabase.getInstance(context)
//}
//
//fun provideSpreadResultDao(journalDatabase: JournalDatabase): JournalItemDAO {
//    return journalDatabase.journalItemDAO
//}
//
//fun provideSpreadResultRepository(journalItemDAO: JournalItemDAO): JournalItemRepository {
//    return JournalItemRepository(journalItemDAO)
//}