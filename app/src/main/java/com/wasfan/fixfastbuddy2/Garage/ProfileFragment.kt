package com.wasfan.fixfastbuddy2.Garage

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import com.wasfan.fixfastbuddy2.R


class ProfileFragment : Fragment() {

    private lateinit var earning : LinearLayout
    private lateinit var ratings : LinearLayout
    private lateinit var mechanics : LinearLayout
    private lateinit var manageServices : LinearLayout
    private lateinit var helpAndSupport : LinearLayout
    private lateinit var aboutUs : LinearLayout
    private lateinit var logout : LinearLayout


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val view = inflater.inflate(R.layout.garage_fragment_profile, container, false)

        val nextActivity: View = view.findViewById(R.id.viewProfile)

        nextActivity.setOnClickListener {

            val intent = Intent(requireContext(), ProfilePage::class.java)
            startActivity(intent)
        }

        earning=view.findViewById(R.id.earnings)
        ratings=view.findViewById(R.id.ratings)
        mechanics=view.findViewById(R.id.mechanics)
        manageServices=view.findViewById(R.id.manageServices)
        helpAndSupport=view.findViewById(R.id.helpSupport)
        aboutUs=view.findViewById(R.id.aboutUs)
        logout = view.findViewById(R.id.logout)


        earning.setOnClickListener {
            startActivity(Intent(requireContext(), EarningsPage::class.java))
        }

        ratings.setOnClickListener {
            startActivity(Intent(requireContext(), RatingsPage::class.java))
        }

        mechanics.setOnClickListener {
            startActivity(Intent(requireContext(), MechanicsPage::class.java))
        }

        manageServices.setOnClickListener {
            startActivity(Intent(requireContext(), ManageServices::class.java))
        }

        helpAndSupport.setOnClickListener {
            startActivity(Intent(requireContext(), HelpandSupportPage::class.java))
        }

        aboutUs.setOnClickListener {
            startActivity(Intent(requireContext(), AboutUsPage::class.java))
        }

         return view
    }




    }
