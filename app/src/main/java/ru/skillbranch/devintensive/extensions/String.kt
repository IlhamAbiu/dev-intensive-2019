package ru.skillbranch.devintensive.extensions

fun String.truncate(newSize:Int=16) =
    if (this.trim().length>newSize)
        this.trim().dropLast(this.trim().length-newSize).trim()+"..."
    else this.trim()

fun String.trimDoubleWhitespace() = this.replace(" {2,}".toRegex(), " ")

fun String.stripHtml() = this
    .replace("<[^>]+>".toRegex(), "")
    .replace("&[a-z;#\\d]+;".toRegex(), "")
    .trimDoubleWhitespace()