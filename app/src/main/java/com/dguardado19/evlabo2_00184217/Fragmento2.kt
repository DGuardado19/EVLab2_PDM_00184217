package com.dguardado19.evlabo2_00184217

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_fragmento2.view.*

class Fragmento2 : Fragment(), Fragmento1.OnFragmentInteractionListener {
    override fun next(i: Int) {
    }

    override fun back(i: Int) {
    }

    private var listener: OnFragmentInteractionListener? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view= inflater.inflate(R.layout.fragment_fragmento2, container, false)
        view.tv_colorponer.setBackgroundResource(R.color.colorUno)
        return view

    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    interface OnFragmentInteractionListener {
        fun next(i : Int)
        fun back(i : Int)
    }


}
