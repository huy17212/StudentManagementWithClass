/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

public class Student {

    private String code;
    private String fullname;
    private Double avgMark;

    public Student(String code, String fullname, Double avgMark) {
        this.code = code;
        this.fullname = fullname;
        this.avgMark = avgMark;
    }

    public Student() {
    }

    public String getCode() {
        return code;
    }

    public String getFullname() {
        return fullname;
    }

    public Double getAvgMark() {
        return avgMark;
    }

    public String getHocLuc() {
        if (this.avgMark >= 9) {
            return "Giỏi";
        } else if (this.avgMark >= 7) {
            return "Khá";
        } else if (this.avgMark >= 5) {
            return "Trung bình";
        } else if (this.avgMark >= 3) {
            return "Yếu";
        } else if (this.avgMark > 10 || this.avgMark < 0) {
            return "Không định dạng";
        } else {
            return "Không định dạng";
        }
    }

    @Override
    public String toString() {
        return "student{" + "code=" + code + ", fullname=" + fullname + ", avgMark=" + avgMark + '}';
    }
    
    public void showInfoStudent(){
        StringBuilder sb = new StringBuilder();
        sb.append("Mã sinh viên: " + this.getCode() + "\n");
        sb.append("Họ và tên: " + this.getFullname() + "\n");
        sb.append("Điểm trung bình: " + this.getAvgMark() + "\n");
        sb.append("Học lực: " + this.getHocLuc() + "\n\n");
        System.out.println(sb);
    }
}
