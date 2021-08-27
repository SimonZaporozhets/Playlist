package com.szaporozhets.playlist

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class SongUiModel(
    @DrawableRes val songImage: Int,
    @StringRes val songName: Int,
    @StringRes val songAuthor: Int
)