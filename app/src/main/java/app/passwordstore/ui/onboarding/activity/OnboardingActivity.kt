/*
 * Copyright © 2014-2021 The Android Password Store Authors. All Rights Reserved.
 * SPDX-License-Identifier: GPL-3.0-only
 */

package app.passwordstore.ui.onboarding.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.passwordstore.R

class OnboardingActivity : AppCompatActivity(R.layout.activity_onboarding) {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    supportActionBar?.hide()
  }

  override fun onBackPressed() {
    if (supportFragmentManager.backStackEntryCount == 0) {
      finishAffinity()
    } else {
      super.onBackPressed()
    }
  }
}
