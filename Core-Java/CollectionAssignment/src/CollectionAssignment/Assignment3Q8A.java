package CollectionAssignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Assignment3Q8A {
    public static void failFast(Map<String, String> cityCode){

        Iterator<?> itr = cityCode.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry m1 = (Map.Entry)itr.next();
            System.out.println(m1.getKey()+" "+m1.getValue());

            cityCode.put("Uttrakhand","India");
        }
    }
    public static void main(String[] args) {
        Map<String, String> cityCode = new HashMap<String, String>();
        cityCode.put("Delhi", "India");
        cityCode.put("Moscow", "Russia");
        cityCode.put("New York", "USA");
        failFast(cityCode);
    }
}