package me.anwarshahriar.snapdiffer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.anwarshahriar.snapdifferlib.SnapDiffer

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SnapDiffer(resources, packageName)
    }
}
