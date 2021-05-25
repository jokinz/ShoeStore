package com.udacity.shoestore.list

import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.udacity.shoestore.R
import com.udacity.shoestore.customView
import com.udacity.shoestore.databinding.FragmentListBinding
import kotlinx.android.synthetic.main.fragment_list.*
import kotlinx.android.synthetic.main.fragment_welcome.*
import kotlinx.android.synthetic.main.shoe_item.*


class ListFragment : Fragment() {
    private lateinit var viewModel : ListViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentListBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_list, container, false)
        binding.newShoeButton.setOnClickListener { view : View ->
            Navigation.findNavController(view).navigate(ListFragmentDirections.actionListFragmentToNewShoeFragment())
        }


        viewModel = ViewModelProvider(this).get(ListViewModel::class.java)
        val textView = TextView(this.context)
        textView.setText(viewModel.shoeList[0].name)
        binding.linearLayout.addView(textView)


        for (shoeItem in viewModel.shoeList){
            val textView = TextView(this.context)
            textView.setText(shoeItem.name)
            binding.linearLayout.addView(textView)
        }



        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.list_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val toast = Toast.makeText(this.context, "Regresar", Toast.LENGTH_LONG)
        toast.show()
        return NavigationUI.onNavDestinationSelected(item, requireView().findNavController())
                || super.onOptionsItemSelected(item)
    }
}