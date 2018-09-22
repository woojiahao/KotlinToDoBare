package chill.me.kotlintodo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_add_note.*

class AddNote : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_add_note)

		init()
		connectListeners()
	}

	/**
	 * Code for the back button logic goes here
	 * Do not touch the existing code
	 */
	override fun onSupportNavigateUp(): Boolean {
		onBackPressed()
		return true
	}

	/**
	 * Code for adding the back button to the ActionBar goes here
	 * Do not touch the existing code
	 */
	private fun init() {
		supportActionBar!!.setDisplayHomeAsUpEnabled(true)
		supportActionBar!!.setDisplayShowHomeEnabled(true)
		supportActionBar!!.setDisplayShowTitleEnabled(false)
	}

	/**
	 * Code for adding notes to Firebase goes here
	 */
	private fun connectListeners() {
		confirmNoteFAB.setOnClickListener {
			finish()
		}
	}
}
