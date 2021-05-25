package com.udacity.shoestore.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentLoginBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_login, container, false)
        binding.loginButton.setOnClickListener { view : View ->
            Navigation.findNavController(view).navigate(com.udacity.shoestore.login.LoginFragmentDirections.actionLoginFragmentToMainFragment())
        }
        binding.sigInButton.setOnClickListener { view : View ->
            Navigation.findNavController(view).navigate(com.udacity.shoestore.login.LoginFragmentDirections.actionLoginFragmentToMainFragment())
        }
//        PARA USAR LO DE ABAJO SE NECESITA Android KTX(Jetpack) EN LOS DEPENDENCIES
//        binding.loginButton.setOnClickListener(
//        esto no se puede usar con directions porque "createNavigateOnClickListener cannot take NavDirections"
//            Navigation.createNavigateOnClickListener(LoginFragmentDirections.actionLoginFragmentToMainFragment2())
//        )
        return binding.root
    }
}