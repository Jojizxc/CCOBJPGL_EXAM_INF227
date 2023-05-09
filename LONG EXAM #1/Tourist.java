interface Tourist {

    int budget = 1000;

    void visit();

    void visit(Boracay boracay);
    
    void visit(Pangasinan pangasinan);
    void visit(Zambales zambales);
    void visit(Palawan palawan); 
    void visit(Siargao siargao);
    void visit(LaUnion laUnion);
    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget(); 
}
