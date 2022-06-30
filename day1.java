/* 2022-06-30 first class */

// public class hello {
//     public static void main(String[] args) {
//         System.out.println("Hello, World!");  //"Hello, World!" 출력


///
// class VarEx2 {
//     public static void main(String[] args) {
//       int x = 10, y = 20; // integer x, x assing x= 10, y = 20
//       int tmp = 0; // 초기화
  
//       System.out.println("x:" + x + " y:" + y);
  
//       tmp = x;   //tmp에 x를 넣고 
//       x = y;   //x와 y를 바꾼다 
//       y = tmp;  //y는 tmp다
  
//       System.out.println("x:" + x + " y:" + y);
//     }
//   }

// class StringEx {
//     public static void main(String[] args) {
//     String name = "Ja" + "va";  //ja 문자열과 va 문자열을 합쳐서 assign in name
//     String str = name + 8.0;  // name에 8.0.을 붙여서 전체를 string 으로 지정

//     System.out.println(name);  
//     System.out.println(str);
//     System.out.println(7 + " ");
//     System.out.println(" " + 7);
//     System.out.println(7 + "");  //앞에 숫자가 있어서 자동 형변환
//     System.out.println("" + 7);  
//     System.out.println("" + "");
//     System.out.println(7 + 7 + ""); //앞에 둘이 숫자이니까 앞에 애들 기준으로 ""가 문자로 형변환
//     System.out.println("" + 7 + 7); //앞에가 빈칸으로 string이니까 문자로 형변환
//     }
// // }

// class SumDiff2 {
//     public static void main(String[] args) {
//         System.out.println("82 + 17 = " + 82 +17); // 앞에서 문자열이지만 괄호를 넣어주니까 숫자로 먼저 인식
//         System.out.println("82 - 17 = " + 82-17);
//     }
// }


// import java.util.*;    //scanenr 사용하기 위해 추가

// class ScannerEx {
//     public static void main(String [] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("두자리 정수를 하나 입력해주세요,>");
//         String input = scanner.nextLine();
//         int num = Integer.parseInt(input);  //입력받은 문자열을 숫자로 변환

//         System.out.println("입력내용 :"+input);
//         System.out.printf("num=%d%n",num);

//     }
// }

// import java.util.Scanner;

// class ScanerInteger {
//     public static void main(String[] args) {
//         Scanner stdIn = new Scanner(System.in);

//         System.out.print("정숫값:");
//         int x = stdIn.nextInt();
//         System.out.println(x + "를 입력했습니다.");
//         }
//     }
// }

// import java.util.Scanner;

//  class PlusMinus10 {
//     public static void main(String[] args) {
//         Scanner stdIn = new Scanner(System.in);

//         System.out.print("정수값: ");
//         int x = stdIn.nextInt();  //x에 입력받은 정수값을 저장

//         System.out.println("10을 더한 값은 " + (x+10) + "입니다");
//         System.out.println("10을 뺀 값은 " + (x-10) + "입니다.");

//     }
//  }


// class WindWoodFireMountain {
//      public static void main(String[] args) {
//         System.out.println("금");
//         System.out.println("상");
//         System.out.println("첨");
//         System.out.println("화");
//      }
// }


// class execution {
//     public static void main(String[] args) {
//         System.out.println("첫 Java 프로그램입니다.");
//         System.out.println("화면에 출력하고 있습니다.");
//     }
// }



// class execution {
//     public static void main(String[] args) {
//         System.out.print("첫 Java 프로그램입니다.");
//         System.out.println(" 화면에 출력하고 있습니다.");
// //     }
// // }

// class SumAve1 {
//     public static void main(String[] args) {
//         int x, y;
                
//         x = 63;
//         y = 18;

//         System.out.println("x값은 " + x + "입니다.");
//         System.out.println("y값은 " + y + "입니다.");
//         System.out.println("합계는 " + (x + y) + "입니다.");
//         System.out.println("평균은 " + (x+y)/2 + "입니다.");
//     }
// }

// class SumAve3A {
//     public static void main(String[] args) {
//         int x, y, z ;

//         x = 63;
//         y = 18;
//         z = 52;

//         System.out.println("x값은 "+ x +"입니다.");
//         System.out.println("y값은 " + y + "입니다.");
//         System.out.println("z값은 " + z + "입니다.");
//         System.out.println("합계는 " + (x+y+z)+ "입니다.");
//         System.out.println("평균은 " +(x+y+z)/3 + "입니다.");
//     }
// }
