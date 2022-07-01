
// 변수 하나 입력 받기 

// import java.util.*;    //scanenr 사용하기 위해 추가

// class lowerlight {
//   public static void main(String[] args) {
//     Scanner stdIn = new Scanner(System.in); //입력 받기

//     System.out.print("정수값: "); 
//     int x = stdIn.nextInt();  
//     int y = x % 10; //10으로 나눈 나머지 연산자 : % 2n+1, 2n 활용해서 홀/짝수 구분  
//     int z = x / 10; //10으로 나눈 몫


//     System.out.println("마지막 자릿수를 제외한 값은 " + z + "입니다");
//     System.out.println("마지막 자릿수는 " + y + "입니다.");
//   }
// }

//변수 두개 입력받기

// import java.util.*;

// class SumAveDouble {
//   public static void main(String[] args) {
//     Scanner value1  = new Scanner(System.in);

//     System.out.print("x값: ");
//     double x = value1.nextDouble();
//     System.out.print("y값: ");  
//     double y = value1.nextDouble();

//     System.out.println("합계는 " + (x+y)+ "입니다");
//     System.out.println("평균은 " + (x+y)/2 + "입니다");

// //   }
// // }

// //삼각형 넓이 구하기

// import java.util.*;

// class Triangle{
//   public static void main(String[] args) {
//     Scanner value1 = new Scanner(System.in);
    

//     System.out.println("삼각형의 넓이를 구합니다");
//     System.out.print("밑변: ");
//     double x = value1.nextDouble();
//     System.out.print("높이: ");
//     double y = value1.nextDouble();

//     System.out.println("넓이는 "+ (x*y/2)+ "입니다.");
//   }
// }


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


// class Main {
//     public static void main(String[] args) {
  
//       // 44 page
  
//         package chapter03;
  
//         public class CharType {
//           public static void main(String[] args) {
  
//           char a = 'A';
  
//           System.out.println("a:"+a);
  
//           int b = a;
//           System.out.println("b:"+b);
  
//           char c = 66;
//           System.out.println("c:"+c);
  
//           int d = a+b; // 65+65
//           System.out.println("d:"+d);
          
//         }
    
//     }
//   }

// 변수 하나 입력 받기 

// import java.util.*;    //scanenr 사용하기 위해 추가

// class lowerlight {
//   public static void main(String[] args) {
//     Scanner stdIn = new Scanner(System.in); //입력 받기

//     System.out.print("정수값: "); 
//     int x = stdIn.nextInt();  
//     int y = x % 10; //10으로 나눈 나머지 연산자 : % 2n+1, 2n 활용해서 홀/짝수 구분  
//     int z = x / 10; //10으로 나눈 몫


//     System.out.println("마지막 자릿수를 제외한 값은 " + z + "입니다");
//     System.out.println("마지막 자릿수는 " + y + "입니다.");
//   }
// }

//변수 두개 입력받기

// import java.util.*;

// class SumAveDouble {
//   public static void main(String[] args) {
//     Scanner value1  = new Scanner(System.in);

//     System.out.print("x값: ");
//     double x = value1.nextDouble();
//     System.out.print("y값: ");  
//     double y = value1.nextDouble();

//     System.out.println("합계는 " + (x+y)+ "입니다");
//     System.out.println("평균은 " + (x+y)/2 + "입니다");

// //   }
// // }

// //삼각형 넓이 구하기

// import java.util.*;

// class Triangle{
//   public static void main(String[] args) {
//     Scanner value1 = new Scanner(System.in);
    

//     System.out.println("삼각형의 넓이를 구합니다");
//     System.out.print("밑변: ");
//     double x = value1.nextDouble();
//     System.out.print("높이: ");
//     double y = value1.nextDouble();

//     System.out.println("넓이는 "+ (x*y/2)+ "입니다.");
//   }
// }

// if- basic 1

// class FlowEx1 {
//   public static void main(String[] args) {

//     int x = 0;
//     System.out.printf("x = %d일때, 참인 것은%n", x); //%d는 자리 표시자로 d는 decimal을 의미, 뒤에서 가져옴 %n는 줄바꿈하는 대행문자 
                 
//     // if 뒤에는 중괄호 쓰는 버릇 들이기
//     if(x ==0) {
//       System.out.println("x ==0");
//   }
//     if(x!=0) {
//       System.out.println("x!=0");}
//     if(!(x==0)) {
//       System.out.println("!(x==0)");}
//     if(!(x!=0)) {
//       System.out.println("!(x!=0)");}

//     x =1;
//     System.out.printf("x=%d일때, 참인 것은%n",x);

//     if(x ==0) {
//       System.out.println("x ==0");}
//     if(x!=0) {
//       System.out.println("x!=0");}
//     if(!(x==0)) {
//       System.out.println("!(x==0)");}
//     if(!(x!=0)) {
//       System.out.println("!(x!=0)");}
//   }
// }

// if basic 2

// import java.util.*;

// class FlowEx2 {
//   public static void main(String[] args) {
//     int input;

//     System.out.print("숫자를 하나 입력하세요.>");

//     Scanner string = new Scanner(System.in);
//     String tmp = string.nextLine(); //입력 받기
//     input = Integer.parseInt(tmp); // integer로 변환
    
//     if(input==0) {    //0이면
//       System.out.println("입력하신 숫자는 0입니다.");} //0 아니라고 말하기
//     if(input!=0) {
//       System.out.println("입력하신 숫자는 0이 아닙니다."); //
//       System.out.printf("입력하신 숫자는 %d입니다.", input);
      
//     }
//     }
//   }


// if basic 3

// import java.util.*;

// class FlowEx3 {
//   public static void main(String[] args) {
//     System.out.print("숫자를 하나 입력하세요.>");  //요청문
//     Scanner string = new Scanner(System.in); // scanner에 지정
//     int input = string.nextInt();  //변수는 입력받은 걸로

//     if(input == 0) {  // 조건문
//       System.out.println("입력하신 숫자는 0입니다.");  //if true 
//     } else {
//       System.out.println("입력하신 숫자는 0이 아닙니다."); //if false
//     }
  
//     }
//     }
  

//if basic 4 홀수 짝수 구분하기 

// import java.util.*;

// class Distinguishodd {
//   public static void main(String[] args) {
//     System.out.print("숫자를 하나 입력하세요.>");
//     Scanner value1 = new Scanner(System.in);
//     int x = value1.nextInt();

//     if(x%2 ==1) {
//       System.out.println("입력하신 숫자는 홀수입니다.");
//     } else {
//       System.out.println("입력하신 숫자는 짝수입니다.");
//     }
//     }
//   }

// if basic 5 n의 배수 찾기

import java.util.*;

class Distinguish3time {
  public static void main(String[] args) {
    System.out.print("숫자 하나를 입력하세요.>");
    Scanner value1 = new Scanner(System.in);
    int x = value1.nextInt();

    if(x >= 90) {
      System.out.println("당신의 학점은 A입니다.");
    } else if(x >= 80) {
      System.out.println("당신의 학점은 B입니다.");
    } else if(x >=70) {
      System.out.println("당신의 학점은 C입니다.");
    } else {
      System.out.println("당신의 학점은 D입니다.");
    }

    }
    }
  

//if application1 if else 로 추가 조건문

  
// import java.util.*;

// class Distinguish3time {
//   public static void main(String[] args) {
//     System.out.print("점수를 입력하세요.>");
//     Scanner value1 = new Scanner(System.in);
//     int x = value1.nextInt();

//     if(x >= 90) {
//       System.out.println("당신의 학점은 A입니다.");
//     } else if(x >= 80) {
//       System.out.println("당신의 학점은 B입니다.");
//     } else if(x >=70) {
//       System.out.println("당신의 학점은 C입니다.");
//     } else {
//       System.out.println("당신의 학점은 D입니다.");
//     }

//     }
//     }
