package uz.orign.materialdialogslib

import android.content.Context
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import com.google.android.material.dialog.MaterialAlertDialogBuilder

object Dialogs {

    fun customMaterialDialog(context: Context, title: String, text: String) {
        val builder = AlertDialog.Builder(context)
        builder.apply {
            setTitle(title)
            setMessage(text)
            setPositiveButton("AGREE") { dialog, which ->
            }
            setNegativeButton("DISAGREE") { dialog, which ->
            }
            show()
        }
    }



}