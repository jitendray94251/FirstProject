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
        reverseString();
    }
    public static void reverseString(){
        String city = "HYDERABAD";
        char[] cty = city.toCharArray();
        char[] revCity= new char[city.length()];
        int first=0;
        int last = city.length()-1;
        System.out.println(last);
        while(first<=last){
            revCity[first]=cty[last];
            revCity[last]=cty[first];
            first++;
            last--;
        }
        System.out.print(revCity);
    }
}
