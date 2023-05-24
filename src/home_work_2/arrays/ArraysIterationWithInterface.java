package home_work_2.arrays;

import static home_work_2.utils.ArrayUtils.arrayFromConsole;

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

    public static void executeOperations(IArraysOperation arraysOperation) {
        arraysOperation.elementsOutput(arrayFromConsole());
        System.out.println();
        arraysOperation.everySecondElement(arrayFromConsole());
        System.out.println();
        arraysOperation.reversElementsOutput(arrayFromConsole());
        System.out.println();
    }
}

