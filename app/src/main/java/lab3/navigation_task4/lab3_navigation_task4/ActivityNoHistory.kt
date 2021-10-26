package lab3.navigation_task4.lab3_navigation_task4

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import lab3.navigation_task4.lab3_navigation_task4.databinding.NoHistoryBinding

class ActivityNoHistory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = NoHistoryBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonActivity2.setOnClickListener{
            goToSecondActivity()
        }
        binding.buttonBackActivity1.setOnClickListener{
            finish()
        }
    }
    private fun goToSecondActivity(){
        val intent = Intent(this, Activity2::class.java)
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.app_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (item.itemId == R.id.about) {
            val intent = Intent(this, ActivityAbout::class.java)
            startActivity(intent)
            true
        }
        else super.onOptionsItemSelected(item)
    }
}