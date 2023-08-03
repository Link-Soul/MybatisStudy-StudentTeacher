package com.link.pojo;

public class Student {

    private int id;
    private String sname;
    private int age;
    private int tid;


    private Teacher teacher;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", sname='" + sname + '\'' +
                ", age=" + age +
                ", tid=" + tid +
                ", teacher=" + teacher +
                '}';
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher() {
        this.teacher = teacher;
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }
}
