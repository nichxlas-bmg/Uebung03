package h3;

public class H3_Main {

	public static void main(String[] args) {
int max = 5;
int fix = 2;
int  wartend = 1;
boolean istVoll = false;



if (max > fix && wartend + fix >= max) {
	int a = max -fix; // 3
	fix = max; // fix = 5
	wartend = wartend - a; 
	istVoll = true;
	
}

if (max > fix && wartend +fix < max) {
	fix = fix + wartend; 
	wartend = 0;
	istVoll = false;
}


System.out.println(fix);
System.out.println(wartend);
System.out.println(istVoll);



	}

}
