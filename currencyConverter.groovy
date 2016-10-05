print "If I give you GBP 1, how many Euro will you give me? ";
double euroOverPoundRatio = Double.parseDouble(System.console().readLine());
print "If I give you 1 EUR, how many Sterling pounds will you give me? ";
double poundOverEuroRatio = Double.parseDouble(System.console().readLine());
println "OK, now I know enough.";
boolean finished = false;
while (!finished) {
    println "";
    println "What would you like to do?";
    println "   1 - Exchange pounds into euro";
    println "   2 - Exchange euro into pounds";
    println "   0 - Exit the program";
    println "";
    print   "> ";
    int choice = Integer.parseInt(System.console().readLine());
    switch (choice) {
    case 1:
	  print "How many pounds would you like to convert? ";
	  double pounds = Double.parseDouble(System.console().readLine());
	  double euro   = pounds * euroOverPoundRatio;
	  println "GBP " + pounds + " will give you " + euro + " EUR";
	  break;
    case 2: 
	  print "How many euro would you like to convert? ";
	  double euro   = Double.parseDouble(System.console().readLine());
	  double pounds = euro * poundOverEuroRatio;
	  println euro + " EUR will give you GBP " + pounds;
	  break;
    case 0: 
	  finished = true;
	  break;
    default: 
	  println "Sorry, that is not a valid option";
    }	  
}
println "Exiting the program";

