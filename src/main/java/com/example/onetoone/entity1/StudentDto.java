package com.example.onetoone.entity1;

import lombok.Data;

@Data
public class StudentDto {
    private String sportType;
    private String studentName;
  //  private  String place;




    public StudentDto() {
        this.sportType = sportType;
        this.studentName = studentName;
    //    this .place=place;
    }

    public String getSportType() {
        return sportType;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /*public String getPlace() {
        return place;
   }

    public void setPlace(String place) {
        this.place = place;
    }*/
}
