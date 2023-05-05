package home_work_2.arrays;

public class ArraysIterationWithInterface {
    public static void main(String[] args) {
        DoWhileOperation doWhileOperation = new DoWhileOperation();
        WhileOperation whileOperation = new WhileOperation();
        ForOperation forOperation = new ForOperation();
        ForEachOperation forEachOperation = new ForEachOperation();

        doWhileOperation.elementsOutput();
        System.out.println();
        doWhileOperation.everySecondElement();
        System.out.println();
        doWhileOperation.reversElementsOutput();
        System.out.println();

        whileOperation.elementsOutput();
        System.out.println();
        whileOperation.everySecondElement();
        System.out.println();
        whileOperation.reversElementsOutput();
        System.out.println();

        forOperation.elementsOutput();
        System.out.println();
        forOperation.everySecondElement();
        System.out.println();
        forOperation.reversElementsOutput();
        System.out.println();

        forEachOperation.elementsOutput();
        System.out.println();
        forEachOperation.everySecondElement();
        System.out.println();
        forEachOperation.reversElementsOutput();
        System.out.println();



    }
}
