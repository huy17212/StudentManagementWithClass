/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import entity.Student;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 *
 * @author Huy1721
 */
public class demo {

    public static void main(String[] args) {
        Map<String, Object> map = new TreeMap(); // mac

        map.put("13", "12");
        map.put(new Integer(10).toString(), "10");
 
        System.out.println(map);
        map.put("12", 12);
        if (map.containsKey("12")) {
            map.remove("13");
        }

        System.out.println(map);
    }

}
