public class Day1 {

    public static void main(String[] args){

        String Name = "Jitendra";
        String newName= "";
        int length = Name.length();
        System.out.println(length);
        for(int i= length-1; i>= 0; i--){
            newName = newName + Name.charAt(i);
        }
        System.out.println(newName);
    }
}
