package com.ugurcangal.travelbook.roomdb

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.ugurcangal.travelbook.model.Place
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Flowable

@Dao
interface PlaceDAO {
    @Query("SELECT * FROM PlaceTable")
    fun getAll(): Flowable<List<Place>>

    @Insert
    fun insert(place: Place): Completable

    @Delete
    fun delete(place: Place): Completable

}