public class passwordGenerator {

    public static void main(String[] args) {
        //First initialize alphabet or whatever you want
        String alphabet ="abcdefghijklmnopqrstuvwxyz";
        //this is our password variable
        String password = "";
        long a = 0;
        //While loop, you can change how many times prints
        while (a<Long.MAX_VALUE){
            // initialize a random number in every loop ,this will be change in evey loop
            int randomNumber = (int)(Math.random() * 26);
            //making random character
            char newChar = alphabet.charAt(randomNumber);
            //add new character to your current password
            password = password+newChar;
            //this line means if password equals to eight
            //print the password to screen and clear the password variable
            //i want to eight character in my password, you can change this how many
            //character you want in your password
            if(a%8==0){
                //printing password
                System.out.println(password);
                //clear the password
                password ="";
            }

            a++;
        }
        //by the way this loop is infinite be carefulll!!!


    }
}
