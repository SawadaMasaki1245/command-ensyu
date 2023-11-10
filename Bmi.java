import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("身長を入力してください。例：〇.〇(m)");
        double height =Double.parseDouble(scanner.nextLine());
        System.out.println("体重を入力してください。例：〇〇.〇(kg)");
        double weight =Double.parseDouble(scanner.nextLine());

        System.out.println("身長を入力してください。例：〇.〇(m)");
        double height2 =Double.parseDouble(scanner.nextLine());
        System.out.println("体重を入力してください。例：〇〇.〇(kg)");
        double weight2 =Double.parseDouble(scanner.nextLine());

        double sum =(weight / (height*height));

        double sum2 =(weight2 / (height2*height2));

        System.out.println("一人目のBMI値は、"+"["+String.format("%.2f",sum)+"]"+"です。");

        System.out.println("二人目のBMI値は、"+"["+String.format("%.2f",sum2)+"]"+"です。");

        if (sum >= 25 ){
            System.out.println("一人目は、肥満気味です。" );
            System.out.println("ダイエットをおすすめします。");
        } else if (18 <= sum) {
            System.out.println("一人目は、適正体重です。");
            System.out.println("このまま健康に気遣って生活しましょう。");
        }else {
            System.out.println("一人目は、瘦せすぎです。");
            System.out.println("日常的に栄養のある物を摂取することをおすすめします。");
        }


        if (sum2 >= 25 ){
            System.out.println("二人目は、肥満気味です。" );
            System.out.println("ダイエットをおすすめします。");
        } else if (18 <= sum2) {
            System.out.println("二人目は、適正体重です。");
            System.out.println("このまま健康に気遣って生活しましょう。");
        }else {
            System.out.println("二人目は、瘦せすぎです。");
            System.out.println("日常的に栄養のある物を摂取することをおすすめします。");
        }
    }
}
