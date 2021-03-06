package me.shouheng.utils.ktx

import android.graphics.drawable.Drawable
import android.view.View
import me.shouheng.utils.ui.ImageUtils
import me.shouheng.utils.ui.ViewUtils

fun Float.dp2px(): Int = ViewUtils.dp2px(this)

/** Get pixels of given dp */
fun Float.dp(): Int = ViewUtils.dp2px(this)

fun Float.px2dp(): Int = ViewUtils.px2dp(this)

fun Float.sp2px(): Int = ViewUtils.sp2px(this)

/** Get pixels of given sp */
fun Float.sp(): Int = ViewUtils.sp2px(this)

fun Float.px2sp(): Int = ViewUtils.px2sp(this)

fun View.alpha(alpha: Float) { ViewUtils.setAlpha(this, alpha) }

fun View.gone() { ViewUtils.setGone(this) }

/** Gone if match [goneIf] else visible. */
fun View.gone(goneIf: Boolean) { if (goneIf) ViewUtils.setGone(this) else ViewUtils.setVisible(this) }

fun View.invisible() { ViewUtils.setInvisible(this) }

fun View.visible() { ViewUtils.setVisible(this) }

fun View.setBackgroundCompact(drawable: Drawable) { ViewUtils.setBackground(this, drawable) }

fun View.toBitmap() { ImageUtils.view2Bitmap(this) }
