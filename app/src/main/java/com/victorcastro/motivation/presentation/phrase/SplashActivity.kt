package com.victorcastro.motivation.presentation.phrase

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.victorcastro.motivation.R
import com.victorcastro.motivation.data.model.MotivationConstants
import com.victorcastro.motivation.data.model.MotivationConstants.KEY.PERSON_NAME
import com.victorcastro.motivation.data.response.SecurityResponse
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var mSecurityResponse: SecurityResponse

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        if(supportActionBar != null) {
            supportActionBar!!.hide()
        }

        button_save.setOnClickListener(this)
        mSecurityResponse = SecurityResponse(this)

        verifyName()
    }
    override fun onClick(view: View) {
        val id: Int = view.id
        if(id == R.id.button_save){
            handleSave()
        }
    }

    private fun verifyName() {
        val name: String = mSecurityResponse.getString(MotivationConstants.KEY.PERSON_NAME)

        if(name != "") {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }

    private fun handleSave(){
        val name : String = edit_name.text.toString()

        if(name != ""){
            mSecurityResponse.storeString(PERSON_NAME, name)
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }else{
            Toast.makeText(this,getString(R.string.informe_seu_nome), Toast.LENGTH_SHORT).show()
        }
    }
}