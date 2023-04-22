/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import entity.ClassRoom;
import entity.Student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import service.classroomService;
import service.impl.classroomServiceImpl;
import service.impl.studentServiceImpl;
import service.studentService;

/**
 *
 * @author Huy1721
 */
public class getSomeMockData {

    public static Map<String, ClassRoom> allClassRoom = new HashMap<>();

    public static void addData() {
        Student HHTri = new Student("hs1", "Hà Huy Trí", 7.0);
        Student VuVaThien = new Student("hs2", "Vũ Văn Thiện", 8.0);
        Student LgTnVy = new Student("hs3", "Lương Tuấn Vỹ", 7.0);
        Student DiVoHoAn = new Student("hs1", "Đinh Võ Hoài Ân", 3.5);
        Student KimSa = new Student("hs2", "Kim Sa", 6.2);
        Student NgoThDung = new Student("hs3", "Ngô Thùy Dụng", 1.0);
        Student BicThao = new Student("hs1", "Bích Thảo", 10.0);
        Student ToaPhong = new Student("hs2", "Toàn Phong", 3.0);
        
        List<Student> listStudentLop12A1 = new ArrayList<>();
        ClassRoom classroom1 = new ClassRoom(listStudentLop12A1);
        
        listStudentLop12A1.add(HHTri);
        listStudentLop12A1.add(VuVaThien);
        listStudentLop12A1.add(LgTnVy);
        allClassRoom.put("12A1", classroom1);
        
        List<Student> listStudentLop12A2 = new ArrayList<>();
        listStudentLop12A2.add(DiVoHoAn);
        listStudentLop12A2.add(KimSa);
        listStudentLop12A2.add(NgoThDung);
        ClassRoom classroom2 = new ClassRoom(listStudentLop12A2);
        allClassRoom.put("12A2", classroom2);
        
        List<Student> listStudentLop12A3 = new ArrayList<>();
        listStudentLop12A3.add(BicThao);
        listStudentLop12A3.add(ToaPhong);
        ClassRoom classroom3 = new ClassRoom(listStudentLop12A3);
        allClassRoom.put("12A3", classroom3);
    }
}
