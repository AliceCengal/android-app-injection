package com.cengallut.appinjection

import android.app.{Fragment, Activity}

trait AppInjection[APP <: android.app.Application] {

  def app: APP = this match {
    case a: Activity => a.getApplication.asInstanceOf[APP]
    case f: Fragment => f.getActivity.getApplication.asInstanceOf[APP]
    case _           => throw new IllegalStateException(AppInjection.INHERITANCE_ERROR)
  }

}

private object AppInjection {

  val INHERITANCE_ERROR = "This trait should only be mixed into Fragment or Activity"

}
