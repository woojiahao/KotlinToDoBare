package chill.me.kotlintodo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_home)

		init()
		connectListeners()
	}

	/**
	 * Code for loading RecyclerView with data goes here
	 */
	private fun init() {

	}

	/**
	 * Code for launching the Add Note activity goes here
	 * Do not touch the existing code
	 */
	private fun connectListeners() {
		addNoteFAB.setOnClickListener { startActivity(Intent(this, AddNote::class.java)) }
	}
}
