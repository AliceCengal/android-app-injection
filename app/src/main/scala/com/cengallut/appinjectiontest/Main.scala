package com.cengallut.appinjectiontest

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import com.cengallut.appinjection.AppInjection

class Main extends Activity with AppInjection[SampleApp] {

  override def onCreate(saved: Bundle): Unit = {
    super.onCreate(saved)

    val tv = new TextView(this)
    tv.setText(app.randomFact)

    setContentView(tv)
  }

}