package com.nguyenxuansangvn.demobase.data.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Date (
    @SerializedName("maximum")
    var maximum: String,
    @SerializedName("minimum")
    var minimum: String
): Parcelable
