package h1;

public class H1_main {

	public static void main(String[] args) {
double guthaben = -100;
double monEingang = 200;
int rating = -2;
boolean warnhinweis = false;
boolean negativ = false;


if (guthaben < 0) {
	negativ = true;
	if (monEingang >= guthaben) {
		rating = rating +1;
	}
	else if (monEingang < guthaben) {
		rating = rating - 1;
		if(rating < 0) {
			warnhinweis = true;
		} else {
			warnhinweis = false;
		}
			
		

}
} 
else if (guthaben > 0){
    negativ = false;
    rating = rating + 3;
    
}
else if (guthaben == 0) {
	negativ = false;
	rating = rating +2;
}
System.out.println(rating);
System.out.println(warnhinweis);
System.out.println(negativ);




	}

}
