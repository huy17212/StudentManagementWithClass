/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import entity.Student;
import java.util.List;

/**
 *
 * @author Huy1721
 */
public interface studentService {

    public Boolean updateStudent(String codeClassRoom, Student entity);

    public Boolean insertStudent(String codeClassRoom, Student entity);

    public Boolean deleteStudent(String codeClassRoom, String code);
    
    public Student findStudentInClassRoomByCode(String codeClassRoom, String code);
}
