package com.wasfan.fixfastbuddy2.mechanic

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.wasfan.fixfastbuddy2.R

class Account : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_account, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Find the LinearLayout and textview by its ID
        val viewProfile: LinearLayout = view.findViewById(R.id.viewProfileL)
        val earningsLayout: LinearLayout = view.findViewById(R.id.earnings)
        val ratingsAndReviewsLayout: LinearLayout = view.findViewById(R.id.ratingsAndReviews)
        val manageServicesLayout: LinearLayout = view.findViewById(R.id.manageServices)
//        val helpAndSupportLayout: LinearLayout = view.findViewById(R.id.helpAndSupport)
//        val aboutUsLayout: LinearLayout = view.findViewById(R.id.aboutUs)

        // Set OnClickListener to navigate to the ViewProfile activity
        viewProfile.setOnClickListener {
            // Create an Intent to navigate to the ViewProfile activity
            val intent = Intent(activity, ViewProfile::class.java)
            startActivity(intent)
        }

        // Set OnClickListener to navigate to the earnings activity
        earningsLayout.setOnClickListener {
            // Create an Intent to navigate to the earnings activity
            val intent = Intent(activity, Earnings::class.java)
            startActivity(intent)
        }

        ratingsAndReviewsLayout.setOnClickListener {
            // Create an Intent to navigate to the RatingsAndReview activity
            val intent = Intent(activity, RatingsAndReviews::class.java)
            startActivity(intent)
        }

        manageServicesLayout.setOnClickListener {
            // Create an Intent to navigate to the manageServices activity
            val intent = Intent(activity, manageServices::class.java)
            startActivity(intent)
        }

//        helpAndSupportLayout.setOnClickListener {
//            // Create an Intent to navigate to the earnings activity
//            val intent = Intent(activity, HelpAndSupport::class.java)
//            startActivity(intent)
//        }

//        aboutUsLayout.setOnClickListener {
//            // Create an Intent to navigate to the earnings activity
//            val intent = Intent(activity, Earnings::class.java)
//            startActivity(intent)
//        }
    }
    
}
