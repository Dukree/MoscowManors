package com.max.moscowmanors.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Manors(val nameManors: String, val addressManors: String, val image_usadeb: Int, val history_manors: CharSequence):Parcelable

