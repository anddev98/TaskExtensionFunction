package com.sematec.taskimdb

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.EditText
import android.widget.Toast
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_extension_function.*
import java.security.acl.Group

class ExtensionFunctionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_extension_function)



        //Extension Function Toast
        fun Context.showToast(text: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
            Toast.makeText(this, text, duration).show()
        }

        //Call Toast
        btnToast.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                showToast("This is Toast Extension Function")
            }
        })

        //++++++++++++++++++++++++++++++++++++++++++

        //Extension Function EditText Validations
        fun isValidText(s: String?) = s != null && !s.isEmpty()
        fun isValidEmail(s: String?) =
            isValidText(s) && android.util.Patterns.EMAIL_ADDRESS.matcher(s).matches()

        fun EditText.trimmedText() = this.text?.trim().toString()
        fun EditText.isValidText() = isValidText(this.trimmedText())
        fun EditText.isValidEmail() = isValidEmail(this.trimmedText())

        //Call EditText Validations
        btnValidate.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                fun isValidate() = (edtUsername.isValidText() && edtEmail.isValidEmail())
                if (isValidate() == true) {

                    showToast("UserName  and Email is Correct")
                } else
                    showToast("Please Enter Correct UserName or Email")
            }
        })

        //++++++++++++++++++++++++++++++++++++++++++

    }
}