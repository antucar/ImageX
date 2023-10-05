package com.ImageX.ImageX.repo

import androidx.lifecycle.LiveData
import com.ImageX.ImageX.model.ImageResponse
import com.ImageX.ImageX.roomdb.Art
import com.ImageX.ImageX.util.Resource

interface ArtRepositoryInterface {

    suspend fun insertArt(art : Art)

    suspend fun deleteArt(art: Art)

    fun getArt() : LiveData<List<Art>>

    suspend fun searchImage(imageString : String) : Resource<ImageResponse>

}