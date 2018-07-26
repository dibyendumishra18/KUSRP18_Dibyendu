import ilog.concert.*;
import ilog.cplex.*;


public class test {


    public static void main(String[] args) {
        try {

            IloCplex model = new IloCplex();
            IloNumVar x = model.numVar(2, 3);
            model.addMinimize(x);
            model.setOut(new NullPrintStream());
            model.solve();

            System.out.println("Solution: x = "+model.getValue(x));
        } catch (IloException ex) {
            ex.printStackTrace();
       }
    }

}
