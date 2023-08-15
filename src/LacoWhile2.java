public class LacoWhile2 {
    public static void main(String[] args) {

        System.out.println("impares");
        int i = 1;
        while (i <= 10){ //0..n
            System.out.println(i);
            i = i +2; //i += 2 => i = i +2
        }

        System.out.println("Impares de 1 em 1");
        i = 1;
        while (i <= 10){
            if(i % 2 != 0)
                System.out.println(i);
            i++; //i += 2 => i = i +2
        }

        System.out.println("pares");
        int p = 2;
        while (p <= 10){
            System.out.println(p);
            p += 2;
        }

        System.out.println("pares invertido");
        p = 10;
        while (p >= 2){
            System.out.println(p);
            p -= 2;
        }

        System.out.println("Multiplos de 3");
        int m3 = 3;
        while (m3 <= 30){
            System.out.println(m3);
            m3 += 3;
        }

    }
}
