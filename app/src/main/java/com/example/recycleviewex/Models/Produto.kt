package com.example.recycleviewex.Models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Produto(
    val userProfileAvatar: String,
    val produtoNome: String,
    val produtoDescricao: String,
    var produtoPreco: Int = 0
): Parcelable
