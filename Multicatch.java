class Multicatch{
    public static void main(String[]args){
        String s=null;
        int arr[]={10,20,30};
        try{
            System.out.println(s.length());
            System.out.println(arr[3]);
            
        }
        catch(ArrayIndexOutOfBoundedException e1){
            System.out.println("Exception Index out of bounds :"+e1);
        }
        catch(NullPointerException e2){
            System.out.println("Exception Null Pointer:"+e2);
        }   
        }
    }
