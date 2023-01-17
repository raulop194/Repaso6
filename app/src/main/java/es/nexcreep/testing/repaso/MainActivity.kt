package es.nexcreep.testing.repaso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import androidx.core.view.isVisible
import es.nexcreep.testing.repaso.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.startButton.setOnClickListener {
            if (binding.editText.isVisible) binding.editText.visibility = View.INVISIBLE
            else binding.editText.visibility = View.VISIBLE
        }

        binding.editText.addTextChangedListener(
            object: TextWatcher {
                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) { }

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) { }

                override fun afterTextChanged(p0: Editable?) {
                    if (binding.editText.text.toString().uppercase().contains("WAYNE"))
                        binding.imageView.visibility = View.VISIBLE
                    else {
                        binding.imageView.visibility = View.INVISIBLE
                    }
                }

            }
        )
    }
}