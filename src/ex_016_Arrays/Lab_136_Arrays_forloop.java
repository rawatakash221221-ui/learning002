package ex_016_Arrays;

public class Lab_136_Arrays_forloop {
    public static void main(String[] args) {
        int []marks={11,12,13,14,15,16,17,18,19,20};
        int max=marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (marks[i]>max){
                max=marks[i];
            }

        }
        System.out.println(max);
    }

}
