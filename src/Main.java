import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//       Scanner sc=new Scanner(System.in);
//        int s=sc.nextInt();
//        int f= sc.nextInt();
//        if (s<f) {//true
//            System.out.println(f);
//        }
//        else {
//            System.out.println(s);
//    }

      /* Scanner scanner=new Scanner(System.in);
       int a=scanner.nextInt();
        if (a>0 && a<3){
            System.out.println("San 1,2");
        }
        else if (a>3 && a<6) {
            System.out.println("Sab 3,4");
        }
        else if (a>6 || a ==6) {
            System.out.println("San 3");
        }
        else {
            System.out.println(a);
        }*/
       /* Scanner scan = new Scanner(System.in);
        int san1 = scan.nextInt(); // 5
        int san2 = scan.nextInt(); // 6
        int san3 = scan.nextInt(); // 7

        if (san1>san2 && san1 >san3){ // false
            System.out.println("san1: "+san1);
        }
        else if (san2>san1 && san2> san3){ // true
            System.out.println("san2:"+san2);
        }
        else if (san3>san2 && san3>san1){
            System.out.println("san3:"+san3);
        }*/
      /*  Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        switch(a){
            case 1 :
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;

            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("Case te jok san");

        }*/
//        Scanner sc = new Scanner(System.in);
//        String b = sc.nextLine();
//        switch (b) {
//            case "USB":
//                System.out.println(84.8);
//                break;
//            case "EURO":
//                System.out.println(95.9);
//                break;
//            case "RUB":
//                System.out.println(1.14);
//                break;
//            case "KZT":
//                System.out.println(0.19);
//                break;
//            default:
//                System.out.println("Mynday valuta jok");}
         /*  Scanner scanner = new Scanner(System.in);
           int a = scanner.nextInt();
           switch (a) {
               case 1:
                   System.out.println("понеделник Теорические темы");
                   break;
               case 2:
                   System.out.println("вторник практика + english");
                   break;
               case 3:
                   System.out.println("среда жаны тема");
                   break;
               case 4:
                   System.out.println("чертверг практика ");
                   break;
               case 5:
                   System.out.println("пятница техникалык сабак");
                   break;
               case 6:
                   System.out.println(" Субота практика");
                   break;
               default:
                   System.out.println("Воскремение сабак болуп калат же болбойт");*/
           /*   Scanner scanner = new Scanner(System.in);
              int san  = scanner.nextInt();
           if (san%2==0) {
               System.out.println("juup san");



         }
           else {
               System.out.println("tak san");
           }*/
      /*  Random random = new Random();
        int b = random.nextInt(5,155);
        System.out.println(b);

        if (b>25&&100>b){
            System.out.println("bar");
        } else
        {
            System.out.println("jok");
        }*/
      /*  Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        switch (a){
            case 1:
                System.out.println("дуйшонбу");
                break;
            case 2:
                System.out.println("шейшемби");
                break;
            case 3:
                System.out.println("шаршемби");
                break;
            case 4:
                System.out.println("шаршемби");
                break;
            case 5:
                System.out.println("жума");
                break;
            case 6:
                System.out.println("ишемби");
                break;
            case 7:
                System.out.println("жекшемби");
            default:{
                System.out.println("жок");
            }
        }*/
    /*  Scanner scanner=new Scanner(System.in);
        int san =scanner.nextInt();
        int a = san / 100;
        int b = san %100 / 10;
        int c = san % 10;
        int max=Math.max(a,b);
        System.out.println(a+" , "+b+" , "+c);
        System.out.println(max);*/

     /*   Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int san1 = a / 100;
        int san2 = (a % 100) / 10;
        int san3 = a % 10;
        if (san1 > san2 && san1 > san3) {
            System.out.println("chon san : " + san1);
        } else if (san2 > san1 && san2 > san3) {
            System.out.println("chon san : " + san2);

        } else if (san3 > san1 && san3 > san2) {
            System.out.println("chon san : " + san3);
        }*/ //уч орунду сандын эн чону

     /* Random random = new Random();
        int a = random.nextInt(600,700);
        int a1 =a/100;
        int b =a%100/1;
        int c =a%10;
        int max =Math.max(a1,b);
        System.out.println(a1+","+b+","+c);
        System.out.println(max); */// уч орунду сандын эн чонун чыгаруу
       /* int san1=2;
        int san2=4;
        int san3=1;
        if (san1<san2&&san1<san3){
            System.out.println(san1+" "+Math.min(san3,san2)+" "+Math.max(san2,san1));

        } else if (san2<san1&&san2<san3) {
            System.out.println(san2+" "+Math.min(san1,san3)+" "+Math.max(san1,san3));

        } else if (san3 <san2&&san3<san1) {
            System.out.println(san3+" "+Math.min(san1,san2)+" "+Math.max(san1,san2));

        }*/
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("автобусга окшош бирок электр энергиясы менен журот");
        boolean bool = true;
        while (bool){
        switch (scanner.nextLine()){
            case "traleibus" :
                System.out.println("tuura azamatsyn");
                bool = false;
                break;
            case "bilbeim":
                System.out.println("tuura jop traleibus");
                bool = false;
                break;
            default:
                System.out.println("dagy oilop korunuz");

        }}*/
//        Scanner scanner = new Scanner(System.in);
//        int s = scanner.nextInt();
//        if (s == 1){
//            System.out.println("понедельник жаны теема!");
//        } else if (s == 2) {
//            System.out.println("вторник практика!");
//        } else if (s == 3){
//            System.out.println("среда теориялык сабак ");
//        } else if (s == 4){
//            System.out.println("чертверг техничиский ангилский");
//        } else if (s ==5) {
//            System.out.println("пятница теориялык сабак ");
//        } else if (s ==6) {
//            System.out.println("суббота практикалык сабак ");
//        } else if (s == 7) {
//            System.out.println("воскрение выходный ");
//
//        }else
//        {
//            System.out.println("туура эмес ");
//
//        }
//        Scanner scan =new Scanner(System.in);
//        int b= scan.nextInt();
//        int a = scan.nextInt();
//     if (b<a){
//         System.out.println(b);
//
//     }else {
//         System.out.println(a);
//     }
        }
    }

