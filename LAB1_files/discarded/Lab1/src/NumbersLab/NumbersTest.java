//// 19SS_INFO_2530_WA - Online - Data Structures Using Java
//// Summer 2019
////
//// Michael Wheeler
//// MCCID: 0891925
//
//package NumbersLab;
//
///**
// * Tests the upper and lower bounds as well as the size of the 
// * arrays constraints.
// * @author mtwheeler
// */
//public class NumbersTest 
//{
//    public static void main(String[] args)
//    {
//        //Tests the upper and lower range.
//        Numbers nums = new Numbers(10);
//        
//        System.out.println("Testing::");
//        int[] testInts = {-10, -1, 0, 30, 45, 50, 90, 100, 101, 200}; 
//        for (int i = 0; i < Numbers.getLength(); i++)
//        {
//            Numbers.setValue(i, testInts[i]);
//        }
//        System.out.println("The entire array now consists of the digits: " 
//                +Numbers.display() + "\n");
//        
//        //Tests the bounds.
//        Numbers num2 = new Numbers(8);
//
//        int[] testInts2 = {30, 45, 50, 90, 100};
//        for (int i = 0; i < Numbers.getLength(); i++)
//        {
//            Numbers.setValue(i, testInts2[i]);
//        }
//        System.out.println("The entire array now consists of the digits: " 
//                +Numbers.display() + "\n");
//
//    }
//}