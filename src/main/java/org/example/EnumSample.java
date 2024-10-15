package org.example;

public enum EnumSample {

     MONDAY(101,"1st day") {
          @Override
          public void dummyMethod() {
               System.out.println("Monday dummy Method");
          }
     },
     SUNDAY(102,"7th day");
     private int val;
     private String comment;

     EnumSample(int val,String comment) {
          this.val=val;
          this.comment=comment;
     }

     public int getVal() {
          return val;
     }
     public String getComment() {
          return comment;
     }

     public static EnumSample getEnumFromValue(int value) {
          for(EnumSample sample: EnumSample.values()) {
//               System.out.println(sample);
               if(sample.val==value) {
                    return sample;
               }
          }
          return null;
     }

     public void dummyMethod() {
          System.out.println("Dummy method");
     }

}
