package org.example;

import java.util.Comparator;

public  class Car implements Comparable<Car> {
    public String carName;
    public String carType;

    Car() {

    }
    public Car (String carName,String carType) {
        this.carName=carName;
        this.carType=carType;
    }

    @Override
    public int  compareTo(Car o1) {
          return o1.carName.compareTo(this.carName);
     }

}
