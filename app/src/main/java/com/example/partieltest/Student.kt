package com.example.partieltest

//Exercice 3

class Student(name: String) : User(name) {
    private var students : MutableList<User>?= null;
    private var subjects = arrayOf("sujet1", "sujet2");
    fun listStudents(){

    }

    fun addStudent(){
        students?.add(User("Kellian"))
    }

    fun deleteStudent(){
        students?.remove(User("Kellian"))
    }

    fun updateStudent(){

    }

    fun listSchoolSubject(){
        for(subject in subjects) {
            println(subject)
        }
    }

    fun addSchoolSubject(){
        subjects.add("sujet3")
    }
}