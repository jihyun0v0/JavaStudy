import java.util.Scanner;

public class Java1 {
   public static int $sum(int n, int m){
     return n+m; 
   }
    public static void main(String args[]){ 
        int m=100, n;
        char st;
        //st="hello";       대입 불가.
        String str="hello";
        String name;

        var num=100;    //자료형 지정할 필요없는 자료형.선언과 동시에 정의 필요.
        byte b=127; 


        System.out.println((byte)(b+m));  //강제 형변활을 통해 값의 손실 발생

        Scanner scanner= new Scanner(System.in);
    
        m=scanner.nextInt();  //int input
        n=scanner.nextInt();

        str=scanner.next(); //string input
        scanner.nextLine(); //이전 scanner.next(); 에서 받는 줄바꿈 문자 처리
        name=scanner.nextLine();

        //System.out.println(scanner.hasNext());  //더 받을 input 값이 있는가?
        System.out.println(str+name);
        System.out.print($sum(m, n)); //프린트 후 줄바꿈 없음

        scanner.close();  //scannner 닫기. 안닫으면 노란줄.
       
        byte a= 4;
        byte c= -2;
        System.out.println("\n" + (a|c));
        System.out.println(c>>1);   //원래 최상위 비트로 빈자리 채움
        System.out.println(c>>>1);  //0으로 빈자리 채움

        switch(str){
          case "hello":
            System.out.println("good");
            break;
          default:
             System.out.println("bad");
        }
        

    }
}