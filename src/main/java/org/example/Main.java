package org.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {

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