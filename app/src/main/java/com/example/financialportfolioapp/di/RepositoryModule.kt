package com.example.financialportfolioapp.di

import com.example.financialportfolioapp.data.AssetRepositoryImpl
import com.example.financialportfolioapp.data.PortfolioItemRepositoryImpl
import com.example.financialportfolioapp.domain.repository.AssetRepository
import com.example.financialportfolioapp.domain.repository.PortfolioItemRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideAssetRepository(): AssetRepository {
        return AssetRepositoryImpl()
    }

    @Provides
    @Singleton
    fun providePortfolioItemRepository(): PortfolioItemRepository {
        return PortfolioItemRepositoryImpl()
    }
}
