package com.startseva.andr_kuz.model

import androidx.annotation.StringRes
import androidx.annotation.DrawableRes

data class Serial (
    @StringRes val titleResourceId: Int,
    @StringRes val descriptonResourceId: Int,
    @DrawableRes val imageResourceId: Int,
){



}