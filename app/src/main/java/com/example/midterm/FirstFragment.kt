package com.example.midterm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.midterm.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.random_button).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
            view.findViewById<Button>(R.id.toast_button).setOnClickListener {
                val myToast = Toast.makeText(context, "Hello Toast!", Toast.LENGTH_SHORT)
                myToast.show()
            }

            fun countMe(view: View) {
                // Get the text view
                val showCountTextView = view.findViewById<TextView>(R.id.textview_first)

                // Get the value of the text view.
                val countString = showCountTextView.text.toString()

                // Convert value to a number and increment it
                var count = countString.toInt()
                count++

                // Display the new value in the text view.
                showCountTextView.text = count.toString()
            }
    }



     }
}
