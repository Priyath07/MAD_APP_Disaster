package com.example.disaster

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [CallFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CallFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_call,container,false)


        val callfire: Button = rootView.findViewById(R.id.callFire)
        val callpolice: Button = rootView.findViewById(R.id.callPiolice)
        val callAmbulance: Button = rootView.findViewById(R.id.callAmbulance)
        val callDoctor: Button = rootView.findViewById(R.id.callDoctor)
        val medicalWeb: Button = rootView.findViewById(R.id.medicalWeb)
        val firsaidTip: Button = rootView.findViewById(R.id.firsaidTip)
        val wethernews: Button = rootView.findViewById(R.id.wethernews)

        callfire.setOnClickListener{
            val number = "+94712536789"
            val  uri = Uri.parse(String.format("tel:$number"))
            val intent = Intent()
            intent.action = Intent.ACTION_DIAL
            intent.data = uri
            startActivity(intent)
        }

        callpolice.setOnClickListener{
            val number = "911"
            val  uri = Uri.parse(String.format("tel:$number"))
            val intent = Intent()
            intent.action = Intent.ACTION_DIAL
            intent.data = uri
            startActivity(intent)
        }

        callAmbulance.setOnClickListener{
            val number = "7788"
            val  uri = Uri.parse(String.format("tel:$number"))
            val intent = Intent()
            intent.action = Intent.ACTION_DIAL
            intent.data = uri
            startActivity(intent)
        }

        callDoctor.setOnClickListener{
            val number = "6969"
            val  uri = Uri.parse(String.format("tel:$number"))
            val intent = Intent()
            intent.action = Intent.ACTION_DIAL
            intent.data = uri
            startActivity(intent)
        }


        medicalWeb.setOnClickListener{

            val url ="https://www.Medicalcentral.com"
            val uri = Uri.parse(url)
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.data = uri
            startActivity(intent)

        }

        firsaidTip.setOnClickListener{

            val url ="https://www.Fire.com"
            val uri = Uri.parse(url)
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.data = uri
            startActivity(intent)

        }

        wethernews.setOnClickListener{

            val url ="https://www.Wethercenter.com"
            val uri = Uri.parse(url)
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.data = uri
            startActivity(intent)

        }

        return inflater.inflate(R.layout.fragment_call, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment CallFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            CallFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}