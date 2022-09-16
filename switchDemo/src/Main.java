public class Main {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade){
            case'A' :
                System.out.println("mühemmel geçtiniz");
                break;
            case'B' :
            case 'C':
                System.out.println("iyi geçtniz");
                break;
            case 'D' :
                System.out.println("fena değil geçtiniz");
                break;
            case 'F' :
                System.out.println("malesef kaldınız");
                break;
            default:
                System.out.println("geçersiz not girdiniz");

        }
    }
}