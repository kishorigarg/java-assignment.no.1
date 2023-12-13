import java.io.File;
class Main{
    public static void main(String[]args){
        File file =new File("newfile.txt");
        try{
            boolean value= file.createNewFile();
        if(value){
            System.out.println("The new file is created");
        }
        else{
            System.out.println("The file is already exist");
    }
        }
    catch(Exception e){
        e.getStackTrace();
    }
    }
}
