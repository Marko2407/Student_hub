package com.mvukosav.studenthub.features.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.mvukosav.studenthub.R
import com.mvukosav.studenthub.databinding.FragmentHomeBinding
import com.mvukosav.studenthub.utils.setupToolbar
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private val viewModel: HomeFragmentViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater)
        (activity as AppCompatActivity).setupToolbar(
            binding.toolbar,
            R.color.baby_blue,
            false
        )
        binding.toolbar.txtToolbarTitle.setText(R.string.home)
        binding.toolbar.imgToolbarIcon.setImageResource(R.drawable.title_home_ic)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView()
        createClickListeners()

    }

    private fun setupView() {
        binding.aboutContainer.title.text = getString(R.string.about)
        binding.aboutContainer.content.text = getString(R.string.about_content)

        binding.ideaContainer.title.text = getString(R.string.idea)
        binding.ideaContainer.content.text = getString(R.string.idea_content)

        binding.helpContainer.title.text = getString(R.string.need_help)
        binding.helpContainer.content.text = getString(R.string.need_help_content)
    }

    private fun createClickListeners() {}
}
