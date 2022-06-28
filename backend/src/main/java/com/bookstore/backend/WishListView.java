package com.bookstore.backend;

import java.util.ArrayList;
import java.util.Scanner;

public class WishListView {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> WishListBooks = new ArrayList<String>();

        System.out.println("Pleaste enter the name of the book you wish to add into the wishlist. Once finished enter done");
        do{
        String Book1=scan.next();
        WishListBooks.add(Book1);
        if (Book1==null)
        break;
        String Book2=scan.next();
        WishListBooks.add(Book2);
        if (Book2==null)
        break;
        String Book3=scan.next();
        WishListBooks.add(Book3);
        if (Book3==null)
        break;
        String Book4=scan.next();
        WishListBooks.add(Book4);
        if (Book4==null)
        break;
        String Book5=scan.next();
        WishListBooks.add(Book5);
        if (Book5==null)
        break;
        String Book6=scan.next();
        WishListBooks.add(Book6);
        if (Book6==null)
        break;
        String Book7=scan.next();
        WishListBooks.add(Book7);
        if (Book7==null)
        break;

        else{System.out.println("The Books in the Wish List are : "
        + WishListBooks);

System.out.println("Enter the name of the book you would like to add to the shopping cart");
String i= scan.next();
WishListBooks.remove(i);

System.out.println("The book has been added to the shopping cart if you wish to move another book enter the name if you want to quit leave blank and hit enter.");
String q=scan.next();
WishListBooks.remove(q);

System.out.println("The books left in the Wish list are "+WishListBooks);
}
        }while(true);
    }
}