/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import data.getSomeMockData;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Huy1721
 */
public class ClassRoom {
    
    Map<String, ClassRoom> map;
    Set<String> set;
    
    private List<Student> listStudent;

    public ClassRoom(List<Student> listStudents) {
        this.listStudent = listStudents;
    }

    public ClassRoom(){
        
    }
    
    public List<Student> getListStudents() {
        return listStudent;
    }

    public void setListStudents(List<Student> listStudents) {
        this.listStudent = listStudents;
    }
    
    public void showInfoStudentAllClassRoom(){
        Map<String, ClassRoom> map = getSomeMockData.allClassRoom;
        Set<String> set = getSomeMockData.allClassRoom.keySet();
        for (String key : set) {
            System.out.println("Đây là thông tin toàn bộ học sinh của lớp " + key + "\n");
            for (Student item : map.get(key).getListStudents()) {
                item.showInfoStudent();
            }
        }
    }
    
    public void showInfoStudentInClassRoom(String codeClassRoom) {
        map = getSomeMockData.allClassRoom;
        set = getSomeMockData.allClassRoom.keySet();
        for (String key : set) {
            if (key.equals(codeClassRoom)) {
                System.out.println("Đây là thông tin toàn bộ học sinh của lớp " + key + "\n\n");
                for (Student item : map.get(key).getListStudents()) {
                    item.showInfoStudent();
                }
            }
        }
    }
    
}
