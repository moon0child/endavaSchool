package com.company;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class Main{

    public static void main(String[] args) {

        Calendar c1 = new GregorianCalendar(2017, Calendar.MARCH, 25);
        Date d1 = c1.getTime();
        Calendar c2 = new GregorianCalendar(2018, Calendar.AUGUST, 25);
        Date d2 = c2.getTime();
        Calendar c3 =new GregorianCalendar();
        Date today=c3.getTime();
        Calendar c4=Calendar.getInstance();
        c4.add(Calendar.DATE,-1);
        Date yesterday=c4.getTime();
        Calendar c5=Calendar.getInstance();
        c5.add(Calendar.DATE,-30);
        Date monthAgo=c4.getTime();
        Calendar c6=Calendar.getInstance();
        c6.add(Calendar.DATE,-40);
        Date d6=c6.getTime();





        ArrayList<Users> ListUsers=new ArrayList<>();

         Users u1=new Users("Anastasia", "Pantelei", 20, "nastiusha3msc@gmail.com", Users.Status.ACTIVE, d1);
         ListUsers.add(u1);
         Users u2=new Users("Vasea", "Pupkin", 16, "vasika@gmail.com", Users.Status.INACTIVE, d2);
         ListUsers.add(u2);
         Users u3=new Users("Ion", "Pomazok", 50,"pomozok@mail.ru", Users.Status.NEW, yesterday);
         ListUsers.add(u3);
         Users u4=new Users("Kylie", "Jenner", 23,"kyliecosmetics@okay.org", Users.Status.INACTIVE,d1);
         ListUsers.add(u4);
         Users u5=new Users("Donatella", "Versace", 70,"donnaMadonna@gmail.com", Users.Status.INACTIVE, d6);
         ListUsers.add(u5);
         Users u6=new Users("Macaulay","Culkin", 40, "homealone@gmail.com", Users.Status.NEW,today );
         ListUsers.add(u6);



        System.out.println("                                                           ");
        System.out.println("*************************List of users**********************************");
        System.out.println("                                                            ");

        for( int i=0; i< ListUsers.size();i++){
            System.out.println(ListUsers.get(i));
        }

        for (int i=0;i<ListUsers.size();i++){
           if(ListUsers.get(i).getStatus().equals(Users.Status.NEW ) &&  ListUsers.get(i).getDate().after(yesterday))
                    ListUsers.get(i).setStatus(Users.Status.ACTIVE);

      }
        System.out.println("                                                           ");
        System.out.println("****************************Modified list*******************************");
        System.out.println("                                                            ");


        for( int i=0; i< ListUsers.size();i++){
            System.out.println(ListUsers.get(i));
        }

        for (int i=0;i<ListUsers.size();i++){
            if(ListUsers.get(i).getStatus().equals(Users.Status.INACTIVE) && ListUsers.get(i).getDate().before(monthAgo))
                ListUsers.get(i).setStatus(Users.Status.BLOCKED);
        }

        System.out.println("                                                           ");
        System.out.println("**************************And again!*********************************");
        System.out.println("                                                            ");

        for( int i=0; i< ListUsers.size();i++){
            System.out.println(ListUsers.get(i));
        }
    }
}



