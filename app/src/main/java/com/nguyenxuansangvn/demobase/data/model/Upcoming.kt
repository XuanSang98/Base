package com.nguyenxuansangvn.demobase.data.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Upcoming(
    @SerializedName("results")
    var results: List<Movie>,
    @SerializedName("page")
    var page: Int,
    @SerializedName("total_results")
    var totalResults: Int,
    @SerializedName("dates")
    var dates: List<Date>,
    @SerializedName("total_pages")
    var totalPages: Int
) : Parcelable
