package ru.skillbranch.devintensive.models

import User

class Chat
(
        val id:String,
        val members: MutableList<User> = mutableListOf(),
        val message: MutableList<BaseMessage> = mutableListOf()

)
{

}