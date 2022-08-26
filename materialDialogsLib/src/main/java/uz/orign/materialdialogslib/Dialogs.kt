package uz.orign.materialdialogslib

import android.app.DatePickerDialog
import android.content.Context
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import java.util.*
import javax.xml.datatype.DatatypeConstants.MONTHS

object Dialogs {

    fun customMaterialDialog(context: Context, title: String, text: String) {
        val builder = AlertDialog.Builder(context)
        builder.apply {
            setTitle(title)
            setMessage(text)
            setPositiveButton("AGREE") { dialog, which ->
                Toast.makeText(context, "Agree", Toast.LENGTH_SHORT).show()
            }
            setNegativeButton("DISAGREE") { dialog, which ->
                Toast.makeText(context, "Disagree", Toast.LENGTH_SHORT).show()
            }
            show()
        }
    }

    fun dataPickerDialog(context: Context){
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)


        val dpd = DatePickerDialog(context, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->

            // Display Selected date in textbox
          //  lblDate.setText("" + dayOfMonth + " " + MONTHS[monthOfYear] + ", " + year)

        }, year, month, day)

        dpd.show()
    }

}