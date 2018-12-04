import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
		System.out.println("Do you want to get a cat?");
		Scanner s = new Scanner(System.in);
		String answer1 = s.nextLine();
		int numCans = 300;
		int numofBS = 0;
		int numofB = 0;
		int numofP = 0;
		if(answer1.equals("yes")){
			System.out.println("Welcome! We'll give you 300 catcans to start");
				while(numCans > 0) {
					System.out.println("What kind of cat do you like? British Shorthair, Bombay or Persian");
					String answer2 = s.nextLine();
					Cats cc = new Cats(answer2);
					numCans = cc.getCatCans(numCans);
					if(numCans >0) {
						System.out.println("You get a " + answer2 + " ! Now you left " + numCans + " catcans.");
						switch (answer2) {
							case "British Shorthair":
								numofBS++;
								break;
							case "Bombay":
								numofB++;
								break;
							case "Persian":
								numofP++;
						}
					}else {
						System.out.println("Sorry, there are no catcans left. You can't get a cat. :(");
						Ellipse e = new Ellipse(20, 20, 30, 20);
						e.draw();
						Line l1 = new Line(25, 23, 27, 18);
						Line l2 = new Line(27, 18, 29, 21);
						Line l3 = new Line(41, 21, 43, 18);
						Line l4 = new Line(45, 23, 43, 18);
						l1.draw();
						l2.draw();
						l3.draw();
						l4.draw();
						Ellipse eyeLeft = new Ellipse(28, 27, 5, 8);
						Ellipse eyeRight = new Ellipse(42, 27, 5, 8);
						eyeLeft.draw();
						eyeLeft.fill();
						eyeRight.draw();
						eyeRight.fill();
						QuadCurve mouthL = new QuadCurve(33, 38, 36, 37, 37, 35);
						mouthL.draw();
						QuadCurve mouthR = new QuadCurve(37, 35, 38, 37, 41, 38);
						mouthR.draw();
						Text t = new Text(60, 20, "Now you have " + numofBS + " British Shorthair(s), " + numofB + " Bombay(s) and " +
								numofP + " Persian(s)! Try again to get more cats :) ");
						t.draw();
					}
				}
			}else{
				System.out.println("Your cute cats are waiting for you to get them home!! Come and get them now");
		}
    }
}
