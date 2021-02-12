public class VariableArgumentsMethod {

    public void varArgsMethod(int... x)
    {
        System.out.println("Number of arguments: " + x.length);
        for(int val : x)
        {
            System.out.print(val+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        VariableArgumentsMethod variableArgumentsMethod = new VariableArgumentsMethod();
        variableArgumentsMethod.varArgsMethod();
        variableArgumentsMethod.varArgsMethod(10);
        variableArgumentsMethod.varArgsMethod(10,20,30);
        variableArgumentsMethod.varArgsMethod(new int[] {1,2,3,4,5});
    }
}
