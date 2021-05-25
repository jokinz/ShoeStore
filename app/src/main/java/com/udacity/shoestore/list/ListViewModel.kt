package com.udacity.shoestore.list

import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

class ListViewModel : ViewModel() {
    init {
        var shoeList1 : MutableList<Shoe> = mutableListOf()
            shoeList1.add(Shoe("Shoe 1", 40.0, "Company 1", "Description 1"))
            shoeList1.add(Shoe("Shoe 2", 40.0, "Company 1", "Description 2"))
            shoeList1.add(Shoe("Shoe 3", 40.0, "Company 2", "Description 3"))
            shoeList1.add(Shoe("Shoe 4", 40.0, "Company 3", "Description 4"))
            shoeList1.add(Shoe("Shoe 5", 40.0, "Company 5", "Description 5"))

    }

    var shoeList : MutableList<Shoe> = mutableListOf(Shoe("Shoe 1", 40.0, "Company 1", "Description 1"),
        Shoe("Shoe 2", 40.0, "Company 1", "Description 2"),
        Shoe("Shoe 3", 40.0, "Company 2", "Description 3"),
        Shoe("Shoe 4", 40.0, "Company 3", "Description 4"),
        Shoe("Shoe 5", 40.0, "Company 5", "Description 5")
    )
}