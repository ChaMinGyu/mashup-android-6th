package com.mashup.mashup_android_6th

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {

    val users: ArrayList<User> = ArrayList()
    var linearLayoutManager : LinearLayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        addUsers()

        linearLayoutManager = LinearLayoutManager(this)
        user_list_rv.layoutManager = linearLayoutManager
        user_list_rv.adapter = UserAdapter(users, this)


    }

    fun addUsers() {
        users.add(
                User("user1", "pudeada@naver.com")
        )
        users.add(
                User("user2", "@gmail.com")
        )
        users.add(
                User("user3", "email_1")
        )
        users.add(
                User("user4", "email_1")
        )
        users.add(
                User("user5", "email_1")
        )
    }
}
