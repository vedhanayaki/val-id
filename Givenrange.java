package player;
import java.util.Scanner;
public class Givenrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the number");
Scanner s=new Scanner(System.in);
int a=s.nextInt();
	if(a<=9){
		System.out.print("Valid Range");
	}
	else{
		System.out.print("Invalid Range");
	}

	}

}
