package se.systementor;

import java.util.ArrayList;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            System.out.print("Mata in ett tal:");
            list.add(Integer.parseInt(System.console().readLine()));
            System.out.print("Vull du mata in fler?");
            String input = System.console().readLine();

            if(input.equalsIgnoreCase("j") || 
                input.equalsIgnoreCase("y") ||
                input.equals("JA") || input.equals("YES") ){
            }
            else
                break;

        }

        for(int index = 0; index < list.size(); index += 2){
            if(index+1 >= list.size())                
                break;
            int temp = list.get(index);
            list.set(index, list.get(index+1));
            list.set(index+1,temp);
        }

        for(int i: list){
            System.out.println(i);
        }

        
        System.out.println("Hello World!");
    }
}
