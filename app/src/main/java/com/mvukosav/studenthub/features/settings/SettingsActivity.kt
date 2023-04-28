package com.mvukosav.studenthub.features.settings

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.mvukosav.studenthub.R
import com.mvukosav.studenthub.databinding.ActivitySettingsBinding
import com.mvukosav.studenthub.utils.setGone
import com.mvukosav.studenthub.utils.setupToolbar

class SettingsActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySettingsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setupToolbar(binding.toolbar, R.color.cherry_red)
        binding.toolbar.apply {
            txtToolbarTitle.text = getString(R.string.settings)
            btnSettingsToolbar.setGone()
        }
        setContentView(binding.root)
        setOnClickListeners()
    }

    private fun setOnClickListeners() {
        binding.btnSaveChange.setOnClickListener {
            Toast.makeText(this, "Successfully selected language", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean =
        if (item.itemId == android.R.id.home) {
            finish()
            true
        } else {
            super.onOptionsItemSelected(item)
        }

    companion object {
        fun createIntent(context: Context) = Intent(context, SettingsActivity::class.java)
    }
}
