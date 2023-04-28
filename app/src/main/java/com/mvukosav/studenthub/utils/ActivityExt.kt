package com.mvukosav.studenthub.utils

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.setPadding
import com.mvukosav.studenthub.R
import com.mvukosav.studenthub.databinding.LayoutToolbarBinding
import com.mvukosav.studenthub.features.settings.SettingsActivity

fun AppCompatActivity.setupToolbar(
    toolbar: LayoutToolbarBinding,
    color: Int,
    displayHome: Boolean = true
) {
    toolbar.toolbar.let {
        setSupportActionBar(it)
        supportActionBar?.setDisplayHomeAsUpEnabled(displayHome)
        supportActionBar?.setDisplayShowHomeEnabled(displayHome)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.arrow_left)
        it.setBackgroundResource(color)
        it.setPadding(5)
    }
    window.statusBarColor = ContextCompat.getColor(this, color)

    toolbar.btnSettingsToolbar.setOnClickListener {
        val intent = Intent(this, SettingsActivity::class.java)
        startActivity(intent)
    }
}

fun AppCompatActivity.openBrowserOnUrl(urlResId: Int?){
    if (urlResId != null) {
        val openBrowserIntent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse(getString(urlResId))
        )
        this.startActivity(openBrowserIntent)
    }
}

fun toastMsg(context: Context, message: String) {
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}