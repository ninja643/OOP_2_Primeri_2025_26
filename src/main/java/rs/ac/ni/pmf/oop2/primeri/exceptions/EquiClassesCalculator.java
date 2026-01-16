package rs.ac.ni.pmf.oop2.primeri.exceptions;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class EquiClassesCalculator {
    private final int[][] a;

    public void printEquiClasses() {
        int pivot = 0;

        while(pivot < a.length) {
            boolean foundZero = false;
            int newPivot = pivot;

            System.out.print(pivot + " ");

            for (int j = pivot + 1; j < a.length; j++) {
                if (a[pivot][j] == 1) {
                    System.out.println(j + " ");
                } else if (!foundZero) {
                    newPivot = j;
                    foundZero = true;
                }
            }

            pivot = newPivot;
            foundZero = false;
        }
    }
}
