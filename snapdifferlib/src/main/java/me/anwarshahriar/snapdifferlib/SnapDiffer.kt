package me.anwarshahriar.snapdifferlib

import android.content.res.Resources
import android.util.Log
import java.lang.reflect.Field

class SnapDiffer(private val resources: Resources, private val packageName: String) {
    private val layoutClass = Class.forName("${packageName}.R\$layout")

    init {
        logAllToolAttributes()
    }

    private fun logAllToolAttributes() {
        val fields: Array<Field> = layoutClass.declaredFields
        fields.forEach { field ->
            Log.d(TAG, "Field: ${field.name}")
        }
    }

    companion object {
        const val TAG: String = "SnapDiffer"
    }
}