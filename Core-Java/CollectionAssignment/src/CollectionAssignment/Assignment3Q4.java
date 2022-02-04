package CollectionAssignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class DateClass {
    private int date;
    private int month;
    private int year;

    public DateClass(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "DateClass{" +
                "date=" + date +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}

public class Assignment3Q4 {

    public String getEmployee(HashMap<DateClass, String> dob, String employeeName){
        Set set = dob.entrySet();
        Iterator itr = set.iterator();
        Iterator itr2 = set.iterator();
        int day=0;
        int month=0;
        int year=0;
        while (itr.hasNext()){
            Map.Entry m1 = (Map.Entry)itr.next();
            DateClass dateClass = (DateClass)m1.getKey();
            if(m1.getValue().equals(employeeName)){

                day= dateClass.getDate();
                month=dateClass.getMonth();
                year = dateClass.getYear();
            }

        }

        while (itr2.hasNext()){
            Map.Entry m1 = (Map.Entry)itr2.next();
            DateClass dateClass = (DateClass)m1.getKey();
            if( (day==dateClass.getDate() && month==dateClass.getMonth() && year!=dateClass.getYear()) && (!m1.getValue().equals(employeeName)) ){
                return "get method fails";
            }

        }
        return employeeName;
    }

    public static void main(String[] args) {
        HashMap<DateClass,String> employee = new HashMap<>();

        DateClass dateClass1 = new DateClass(04,07,1995);
        DateClass dateClass2 = new DateClass(30,11,2000);
        DateClass dateClass3 = new DateClass(04,07,1995);
        DateClass dateClass4 = new DateClass(01,03,2000);

        employee.put(dateClass1,"Ajay");
        employee.put(dateClass2,"Mansi");
        employee.put(dateClass3,"Max");
        employee.put(dateClass4,"Shrirang");

        Assignment3Q4 assignment4Q4 = new Assignment3Q4();
        System.out.println(assignment4Q4.getEmployee(employee,"Ajay"));



    }
}