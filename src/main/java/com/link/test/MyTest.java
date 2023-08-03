package com.link.test;



import com.link.dao.StudentDao;
import com.link.dao.TeacherDao;
import com.link.pojo.Student;
import com.link.pojo.Teacher;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Set;

public class MyTest {

    public static void main(String[] args) throws IOException {

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        TeacherDao teacherDao = sqlSession.getMapper(TeacherDao.class);
        findAll(studentDao);
        System.out.println("------------------");
        findAllT(teacherDao);


    }

    public static void findAll(StudentDao studentDao){
        //学生查询多对一
        List<Student> students = studentDao.findAll();

        for (Student s : students) {
            System.out.println(s+" 对应的老师是 \t "+ s.getTeacher());
        }
    }
    public static void findAllT(TeacherDao teacherDao){
        //老师查询一对多
        List<Teacher> teacherList = teacherDao.findAllT();

        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
    }
}
