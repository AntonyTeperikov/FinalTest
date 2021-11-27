import java.util.Scanner;

public class calc {
    public static void main(String[] args) throws Exception {

        MathChase MathChase = new MathChase();
        Conver resultroma = new Conver();
        roma chase = new roma();
        Scanner roma = new Scanner(System.in);
        String sc = roma.nextLine();
        String mass[] = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String a[] = sc.split(" ");
        if(a.length > 3){
            throw new Exception("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }else if(a.length < 3){
            throw new Exception("т.к. строка не является математической операцией");
        }
        boolean flag = false;
        boolean flag2 = false;
        for (int i = 0; i < mass.length; i++) {
            if (a[0].equals(mass[i])) {
                flag = true;

            }if (a[2].equals(mass[i])){
                flag2 = true;
            }
        }
        if((flag == true && flag2 == false) || (flag == false && flag2 == true)) {
            throw new Exception("используются одновременно разные системы счисления");

        }
            if (!flag && !flag2) {
                if (Integer.parseInt(a[0]) > 10) {
                    throw new IllegalArgumentException("Число должно быть меньше или равно 10");
                } else {
                    if (Integer.parseInt(a[2]) > 10) {
                        throw new IllegalArgumentException("Число должно быть меньше или равно 10");
                    }

                }
            }
            if (!flag && !flag2) {
                int resultChisel = MathChase.Znaki(a[1], Integer.parseInt(a[0]), Integer.parseInt(a[2]));
                System.out.println(resultChisel);
            } else {
                if (flag && flag2) {
                    int resultChisel = MathChase.Znaki(a[1], chase.romachase(a[0]), chase.romachase(a[2]));

                    if(resultChisel <= 0){
                        throw new Exception("т.к. в римской системе нет отрицательных чисел");

                    }else System.out.println(resultroma.conver(resultChisel));
                }

                }

            }
        }







