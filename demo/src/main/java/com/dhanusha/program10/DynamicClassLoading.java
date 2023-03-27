package com.dhanusha.program10;

import java.lang.Class;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class DynamicClassLoading {

    public static void main(String[] args) {

        try {
            
            Scanner sc = new Scanner(System.in);
            String className = sc.nextLine();
            Class<?> myClass = Class.forName("com.dhanusha.program10."+className);
            Object object = myClass.getDeclaredConstructor().newInstance();
            ((Animal) object).run();
            sc.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (InstantiationException e) {
            e.printStackTrace();
        }
        catch (IllegalAccessException e) {
            e.printStackTrace();
        } 
        catch (IllegalArgumentException e) {
            e.printStackTrace();
        } 
        catch (InvocationTargetException e) {
            e.printStackTrace();
        } 
        catch (NoSuchMethodException e) {
            e.printStackTrace();
        } 
        catch (SecurityException e) {
            e.printStackTrace();
        }
        
    }
    
}
