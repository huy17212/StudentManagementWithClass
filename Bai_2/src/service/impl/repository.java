/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import data.getSomeMockData;
import entity.ClassRoom;
import entity.Student;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class repository {

    Map<String, ClassRoom> map;
    Set<String> set;

    public List<Student> sortClassRoomByAvgmark(List<Student> listStudent, Boolean isASC) {
        Collections.sort(listStudent, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAvgMark() > o2.getAvgMark() ? 1 : -1;
            }
        });
        if (isASC) {
            Collections.reverse(listStudent);
        }
        return listStudent;
    }

    public Student findStudentInClassRoomByCode(String codeClassRoom, String code) {
        map = getSomeMockData.allClassRoom;
        set = getSomeMockData.allClassRoom.keySet();
        for (String key : set) {
            if (key.equals(codeClassRoom)) {
                for (Student item : map.get(key).getListStudents()) {
                    if (item.getCode().equals(code)) {
                        item.showInfoStudent();
                    }
                }
            }
        }
        return null;
    }

    public Boolean updateStudent(String codeClassRoom, Student entity) {
        int index = 0;
        map = getSomeMockData.allClassRoom;
        set = getSomeMockData.allClassRoom.keySet();
        for (String key : set) {
            if (key.equals(codeClassRoom)) {
                for (Student item : map.get(key).getListStudents()) {
                    if (item.getCode().equals(entity.getCode())) {
                        map.get(key).getListStudents().set(index, entity);
                        return true;
                    }
                    index++;
                }
            }
        }
        return false;
    }

    public Boolean insertClassRoom(String codeClassRoom) {
        map = getSomeMockData.allClassRoom;
        set = getSomeMockData.allClassRoom.keySet();
        for (String key : set) {
            if (key.equals(codeClassRoom)) {
                return false;
            }
        }
        map.put(codeClassRoom, new ClassRoom(new ArrayList()));
        return true;
    }

    public Boolean deleteClassRoom(String codeClassRoom) {
        map = getSomeMockData.allClassRoom;
        set = getSomeMockData.allClassRoom.keySet();
        for (String key : set) {
            if (key.equals(codeClassRoom)) {
                map.remove(key);
                return true;
            }
        }
        return false;
    }

    public Boolean deleteStudent(String codeClassRoom, String code) {
        int index = 0;
        map = getSomeMockData.allClassRoom;
        set = getSomeMockData.allClassRoom.keySet();
        for (String key : set) {
            if (key.equals(codeClassRoom)) {
                for (Student item : map.get(key).getListStudents()) {
                    if (item.getCode().equals(code)) {
                        map.get(key).getListStudents().remove(index);
                        return true;
                    }
                    index++;
                }
            }
        }
        return false;
    }

    public Boolean insertStudent(String codeClassRoom, Student entity) {
        map = getSomeMockData.allClassRoom;
        set = getSomeMockData.allClassRoom.keySet();
        for (String key : set) {
            if (key.equals(codeClassRoom)) {
                map.get(key).getListStudents().add(entity);
                return true;
            }
        }
        return false;
    }

    
    public void showAllClassRoom() {
        map = getSomeMockData.allClassRoom;
        set = getSomeMockData.allClassRoom.keySet();
        System.out.println("Có tất " + set.size() + " đang hoạt động, bao gồm: ");
        for (String key : set) {
            System.out.println("lớp: " +key);
        }
    }
}
