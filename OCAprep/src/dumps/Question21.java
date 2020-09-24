//CODE IN THE QUESTION
/* 
package dumps;

public class Question21 {
	 public static void main(String[] args) 
	    { 
		 boolean opt = true;
		 switch (opt) {
		case true:
			System.out.print("True");
			break;
		default:
			System.out.print("********");
			break;
		}
		 System.out.print("Done");
	    }

}
*/
//RECTIFIED CODE
package dumps;

public class Question21 {
	 public static void main(String[] args) 
	    { 
		 String opt = "true";
		 switch (opt) {
		case "true":
			System.out.print("True");
			break;
		default:
			System.out.print("********");
			break;
		}
		 System.out.print("Done");
	    }

}
