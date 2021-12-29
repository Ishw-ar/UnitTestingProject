package com.example.unittestingproject

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.Before

import org.junit.Test

class ResourceComparatorTest{
  private lateinit var resourceComparator:ResourceComparator

  @Before
  fun setUp(){
      resourceComparator= ResourceComparator()
  }

    @Test
    fun `stringResourceSameGivenString_returnTrue`(){
        val context= ApplicationProvider.getApplicationContext<Context>()
        val result=resourceComparator.isEqual(context,R.string.app_name,"UnitTestingProject")
        assertThat(result).isTrue()

    }

    @Test
    fun `stringResourceDifferentGivenString_returnFalse`(){
        val context= ApplicationProvider.getApplicationContext<Context>()
        val result=resourceComparator.isEqual(context,R.string.app_name,"Hello")
        assertThat(result).isFalse()

    }

}