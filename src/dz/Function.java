package dz;

public class Function {
    static void Max (int[] mus, int n){


        for (int i = 0; i < n - 1; i++) {
            if (i == n - 2){
                if(mus[n - 2] > mus[n - 1]){
                    mus[n - 1] = mus[n - 2];
                }else{
                    mus[n - 1] = mus[n - 1];
                }
            }else{
                if (mus[i] > mus[i + 1]){
                    mus[i + 1] = mus[i];
                }else{
                    mus[i + 1] = mus[i + 1];
                }
            }
        }
        System.out.println("Наибольшее число в массиве: " + mus[n - 1]);
    }
}
