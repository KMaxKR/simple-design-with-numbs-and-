public class numbs_and_symbols {
    public static void main(String[] args){
        for(int i = 1; i <= 6; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            for(int m = 6; m > i; m--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
