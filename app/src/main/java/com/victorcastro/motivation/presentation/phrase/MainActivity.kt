package com.victorcastro.motivation.presentation.phrase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.victorcastro.motivation.R
import com.victorcastro.motivation.data.model.MotivationConstants
import com.victorcastro.motivation.data.model.MotivationConstants.KEY.PERSON_NAME
import com.victorcastro.motivation.data.response.SecurityResponse
import com.victorcastro.motivation.data.repository.Mock
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var mSecurityResponse: SecurityResponse
    private var mPhraseFilter: Int = MotivationConstants.PHRASEFILTER.ALL

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mSecurityResponse = SecurityResponse(this)
        val name: String = mSecurityResponse.getString(PERSON_NAME)
        text_name.text = "Olá, $name!"

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        image_all.setColorFilter(resources.getColor(R.color.colorAccent))
        handleNewPhrase()

        image_all.setOnClickListener(this)
        image_happy.setOnClickListener(this)
        image_morning.setOnClickListener(this)
        button_new_phrase.setOnClickListener(this)
    }


    override fun onClick(view: View) {
        val id : Int =  view.id
        val listFilter: List<Int> = listOf(
            R.id.image_all,
            R.id.image_happy,
            R.id.image_morning
        )

        if (id == R.id.button_new_phrase) {
            handleNewPhrase()
        } else if (id in listFilter) {
            handleFilter(id)
        }
    }

    private fun handleNewPhrase() {
        text_frase.text = Mock().getPhrase(mPhraseFilter)
    }

    private fun handleFilter(id: Int) {

        image_all.setColorFilter(resources.getColor(R.color.white))
        image_happy.setColorFilter(resources.getColor(R.color.white))
        image_morning.setColorFilter(resources.getColor(R.color.white))

        when(id) {

            R.id.image_all -> {
                image_all.setColorFilter(resources.getColor(R.color.colorAccent))
                mPhraseFilter = MotivationConstants.PHRASEFILTER.ALL
            }
            R.id.image_happy -> {
                image_happy.setColorFilter(resources.getColor(R.color.colorAccent))
                mPhraseFilter = MotivationConstants.PHRASEFILTER.HAPPY
            }
            R.id.image_morning -> {
                image_morning.setColorFilter(resources.getColor(R.color.colorAccent))
                mPhraseFilter = MotivationConstants.PHRASEFILTER.MORNING
            }
        }
    }
}