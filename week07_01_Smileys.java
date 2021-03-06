
public class Smileys {

    public static void main(String[] args) {
        
        // Test with the following
        printWithSmileys("Hello");
    }
    
    private static void printWithSmileys(String characterString){
        int l = smiled(characterString).length();
        System.out.println(allSmile(l));
        System.out.println(smiled(characterString));
        System.out.println(allSmile(l));
    }
    
    public static String smiled(String text){
        String newStr = "";
        //checking if the string length is odd or even
        if(text.length() % 2 == 0){
            newStr += ":) " + text + " :)";
        }else{
            newStr += ":) " + text + "  :)";
        }
        return newStr;
    }
    
    public static String allSmile(int num){
        String smiles = "";
        int i = 0;
        //at this point the string length will always be a even number, so every two characters I print a smile
        while(i < num/2){
            smiles += ":)";
            i++;
        }
        return smiles;
    }

}

//printed result:

//  :):):):):):)
//  :) Hello  :)
//  :):):):):):)
