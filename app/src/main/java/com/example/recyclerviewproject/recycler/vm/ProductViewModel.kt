package com.example.recyclerviewproject.recycler.vm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.recyclerviewproject.recycler.model.ProductItems
import com.example.recyclerviewproject.recycler.model.productList


class ProductViewModel : ViewModel() {

    private val _products = MutableLiveData<List<ProductItems>>(productList) //Using Live Data
    val products: LiveData<List<ProductItems>> = _products
}