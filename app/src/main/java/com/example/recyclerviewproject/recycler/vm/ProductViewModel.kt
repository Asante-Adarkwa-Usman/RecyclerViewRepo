package com.example.recyclerviewproject.recycler.vm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.recyclerviewproject.recycler.model.ProductItems
import com.example.recyclerviewproject.recycler.model.ProductRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class ProductViewModel : ViewModel() {

    //Getting profile Repository
    private val productRepo: ProductRepository = ProductRepository()

    private val _products = MutableLiveData<List<ProductItems>>() //Using Live Data
    val products: LiveData<List<ProductItems>> = _products

    //fetching productData from ProductRepository
    fun getProductsData(){
        //Using coroutines
       viewModelScope.launch(Dispatchers.IO) {
           val productResult = productRepo.fetchProductData()
           _products.postValue(productResult)
       }
    }
}