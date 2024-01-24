package com.sample;

import java.util.EnumMap;


public class Demo {
    public static void main(String[] args) {

        EnumMap<Size,Integer> shirtSize=new EnumMap<>(Size.class); //EnumMap Creation
        shirtSize.put(Size.SMALL,30); // Adding element
        shirtSize.put(Size.MEDIUM,35);
        shirtSize.put(Size.LARGE,40);
        shirtSize.put(Size.EXTRALARGE,42);
        System.out.println(shirtSize);  //print content
        System.out.println(shirtSize.get(Size.LARGE)); // Get value for a key
        shirtSize.remove(Size.LARGE); // Remove an entry
        System.out.println(shirtSize);

    }


}
