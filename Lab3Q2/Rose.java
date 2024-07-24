package Lab3Q2;

public class Rose {

public static void main (String args[]) {

try{

for(int j=0; j<args.length;j++) {

System.out.println(args[j]-1);

}}catch(ArrayIndexOutOfBoundsException ne)

{

ne.printStackTrace();

}

catch(Exception e) {

System.out.println("Hi");

}

}

}

