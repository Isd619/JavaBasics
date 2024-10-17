package org.example;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
      //Sorting with custom comparator

//        Car []carArray = new Car[3];
//
//        carArray[0]=new Car("SUV","petrol");
//        carArray[1]=new Car("Sedan","diesel");
//        carArray[2]=new Car("HatchBack","cng");

       // Arrays.sort(carArray,(Car obj1,Car obj2) -> obj2.carType.compareTo(obj1.carType));

        List<Car> cars=new ArrayList<>();

        cars.add(new Car("SUV","petrol"));
        cars.add(new Car("Sedan","diesel"));
        cars.add(new Car("HatchBack","cng"));

        Collections.sort(cars);
        for(Car carObj: cars) {
            System.out.println(carObj.carName+" "+carObj.carType);
        }


//       Integer []arr = {2,3,9,6};
//       Arrays.sort(arr); //Normal sort in asc order
    //    Arrays.sort(arr,(Integer a,Integer b) -> a-b); // In ascending order as comparator works on res of (a-b)>0 swap else not
     //   Arrays.sort(arr,(Integer a,Integer b) -> b-a);// sort in descending order because result depends upon the value of (a-b) if this is >0 swap else not
//       for(int x: arr) {
//           System.out.print(x+" ");
//       }


        // Reflection concepts (It breaks the  singleton pattern )
//        Class eagleClass = Eagle.class;
//        Constructor[] eagleConstructorList = eagleClass.getDeclaredConstructors();
//        for(Constructor eagleConstructor: eagleConstructorList) {
//            System.out.println("Modifier: "+ Modifier.toString(eagleConstructor.getModifiers()));
//
//            eagleConstructor.setAccessible(true);
//            Eagle eagleObject = (Eagle) eagleConstructor.newInstance();
//            eagleObject.fly();
//
//        }
//         Consumer<Integer,String> loggerObject = (Integer val) -> {
//             String ans = val.toString();
//             return ans;
//         };
//
//         System.out.println(loggerObject.apply(10));

//          Bird birdfHen = new Hen();
//          Bird birdEagle = new Eagle();
//          birdfHen.fly();
//          birdEagle.fly();

//        for(EnumSample sample : EnumSample.values()) {
//            System.out.println(sample.ordinal());
//        }

//        EnumSample sample = EnumSample.getEnumFromValue(102);
//        System.out.println(sample.getComment());

//        EnumSample modaySample = EnumSample.SUNDAY;
//        modaySample.dummyMethod();

    }
}