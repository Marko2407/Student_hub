package com.mvukosav.studenthub.di

import android.content.Context
import com.mvukosav.studenthub.data.LocalFoodRepository
import com.mvukosav.studenthub.domain.repositories.FoodRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoriesModule {

    @Singleton
    @Provides
    fun provideContext(@ApplicationContext context: Context): Context = context

    @Singleton
    @Provides
    fun provideFoodRepository(): FoodRepository = LocalFoodRepository()

}
