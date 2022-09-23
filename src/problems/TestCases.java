package problems;
class TestInheritance2{
    public static void main(String args[]){
        int arr[][]=new int [3][3];
        arr[0][0]=4;
        arr[0][1]=4;
        arr[0][2]=4;
        arr[1][0]=4;
        arr[1][1]=4;
        arr[1][2]=4;
        arr[2][0]=4;
        arr[2][1]=4;
        arr[2][2]=4;
        for(int ab[]:arr)
        {
            for(int a:ab)
            {
                System.out.print(" "+a);
            }System.out.println();
        }
//        System.out.println(arr[0][0]);
//        System.out.println(arr[0][1]);




    }}
