package Homework5;


public class StudentComparator implements Comparable<Student>{

    @Override
    public int compareTo(Student s){
        return s.sName.compareToIgnoreCase(s.sName);//"z-a" s.sName.compareToIgnoreCase(sName)
    }


}
