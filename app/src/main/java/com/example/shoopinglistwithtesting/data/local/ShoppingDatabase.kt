package com.example.shoopinglistwithtesting.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.shoopinglistwithtesting.data.local.entities.ShoppingItem

@Database(entities = [ShoppingItem::class], version = 1)
abstract class ShoppingDatabase : RoomDatabase() {

    abstract fun shoppingDao(): ShoppingDao
}
