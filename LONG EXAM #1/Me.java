public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay boracay) {
        System.out.println("--------Welcome to Boracay-------");
        System.out.println("Checking your Budget Please wait...");
        System.out.println("my budget is " + budget);
        budget = budget - boracay.airFare;


        if (budget < boracay.airFare) {
            System.out.println("Sorry you do not have enough budget");
        } else{
            System.out.println("You have arrived to boracay");
            System.out.println("Get a Henna Tattoo in Boracay");
        }
        
        System.out.println();

        
    }

    public void visit(Palawan palawan){
        System.out.println("---------Welcome to Palawan---------");
        System.out.println("Checking your Budget Please wait...");
        System.out.println("my budget is " + budget);
        budget = budget - palawan.airFare;
       
        if (budget < palawan.airFare) {
            System.out.println("Sorry you do not have enough budget");
        } else{
            System.out.println("You have arrived to in Palawan");
            System.out.println("Ride a crystal kayak in Palawan");
        }
        
        System.out.println();

        
    }

    public void visit(Zambales zambales) {
        System.out.println("---------Welcome to Zambales---------");
        System.out.println("Checking your Budget Please wait...");
        System.out.println("my budget is " + budget);
        budget = budget - zambales.airFare;

        if (budget < zambales.airFare) {
            System.out.println("Sorry you do not have enough budget");
        } else{
            System.out.println("You have arrived in zambales");
            System.out.println("Ride a ATV in Zambales");
        }
        

        System.out.println();
      
    }

    public void visit(Pangasinan pangasinan){
        System.out.println("---------Welcome to Pangasinan---------");
        System.out.println("Checking your Budget Please wait...");
        System.out.println("my budget is " + budget);
        budget = budget - pangasinan.airFare;
        
        if (budget < pangasinan.airFare) {
            System.out.println("Sorry you do not have enough budget");
        } else{
            System.out.println("You have arrived in Pangasinan");
            System.out.println("Visit every island in Pangasinan");
        }

        System.out.println();
    
    }

    public void visit(Siargao siargao) {
        System.out.println("---------Welcome to Siargao---------");
        System.out.println("Checking your Budget Please wait...");
        System.out.println("my budget is " + budget);
        budget = budget - siargao.airFare;

        if (budget < siargao.airFare) {
            System.out.println("Sorry you do not have enough budget");
        } else{
            System.out.println("You have arrived in Siargao");
            System.out.println("Try surfing in Siargao");
        }

        System.out.println();

    }
    
    public void visit(LaUnion laUnion) {
        System.out.println("---------Welcome to Siargao---------");
        System.out.println("Checking your Budget Please wait...");
        System.out.println("my budget is " + budget);
        budget = budget - laUnion.airFare;

        if (budget < laUnion.airFare) {
            System.out.println("Sorry you do not have enough budget");
        } else{
            System.out.println("You have arrived in La Union");
            System.out.println("Visit attractions such as waterfalls");
            

       
        
    }
    System.out.println(); {

    }

   
       
    }

}
