package com.example.wenubey.repositories

import androidx.lifecycle.LiveData
import com.example.wenubey.data.local.ShoppingItem
import com.example.wenubey.data.remote.responses.ImageResponse
import com.example.wenubey.other.Resource

interface ShoppingRepository {

    suspend fun insertShoppingItem(shoppingItem: ShoppingItem)

    suspend fun deleteShoppingItem(shoppingItem: ShoppingItem)

    fun observeAllShoppingItems(): LiveData<List<ShoppingItem>>

    fun observeTotalPrice(): LiveData<Float>

    suspend fun searchForImage(imageQuery: String): Resource<ImageResponse>
}