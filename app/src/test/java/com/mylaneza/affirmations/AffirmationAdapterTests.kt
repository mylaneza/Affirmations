package com.mylaneza.affirmations

import android.content.Context
import com.mylaneza.affirmations.adapter.ItemAdapter
import com.mylaneza.affirmations.data.Datasource
import com.mylaneza.affirmations.model.Affirmation
import org.junit.Test
import org.mockito.Mockito.mock
import com.mylaneza.affirmations.R
import org.junit.Assert.assertEquals

class AffirmationAdapterTests {
    private val context = mock(Context::class.java)

    @Test
    fun adapterSize(){
        // val datasource = Datasource()
        val data = listOf(
            Affirmation(R.string.affirmation1,R.drawable.image1),
            Affirmation(R.string.affirmation2,R.drawable.image2)
        )
        val adapter = ItemAdapter(context,data)
        assertEquals("ItemAdapter is not the correct size",data.size,adapter.itemCount)
    }
}