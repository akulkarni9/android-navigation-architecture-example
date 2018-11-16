package com.dell.andnav.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.dell.andnav.R
import kotlinx.android.synthetic.main.fragment_welcome.view.*


/**
 * A simple [Fragment] subclass.
 * Use the [WelcomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class WelcomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_welcome, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.detailbutton.setOnClickListener {
            findNavController().navigate(R.id.action_welcomeFragment_to_detailsFragment)
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = WelcomeFragment()
    }
}