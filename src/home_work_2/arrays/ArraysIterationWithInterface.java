package home_work_2.arrays;

public class ArraysIterationWithInterface {
    public static void main(String[] args) {
        DoWhileOperation doWhileOperation = new DoWhileOperation();
        WhileOperation whileOperation = new WhileOperation();
        ForOperation forOperation = new ForOperation();
        ForEachOperation forEachOperation = new ForEachOperation();

        executeOperations(doWhileOperation);
        executeOperations(whileOperation);
        executeOperations(forOperation);
        executeOperations(forEachOperation);
    }

    public static  void executeOperations (IArraysOperation arraysOperation){
        arraysOperation.elementsOutput();
        System.out.println();
        arraysOperation.everySecondElement();
        System.out.println();
        arraysOperation.reversElementsOutput();
        System.out.println();
    }
}

