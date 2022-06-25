package com.ugurcangal.travelbook.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ugurcangal.travelbook.model.Place

@Database(entities = [Place::class], version = 1)

abstract class PlaceDatabase : RoomDatabase(){
    abstract fun placeDAO(): PlaceDAO
}