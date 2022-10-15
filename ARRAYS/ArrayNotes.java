/*

    //IN JAVA EVERYHTING IS PASSED BY VALUE--

    Array :-
        Contigous memory location 
        Similar type of data 

    Array Decleration :

        int arr[];

    Array Inisilation :

        int arr[]=new int [size on array];
    
    Array Inisilation for all datatype in java:
    
        int arr[] = new int [size of array];
        char arr[] = new char [size of array];
        float arr[] = new float [size of array];
        double arr[] = new double[size of array];

    Taking Array as input :
        We can use Scanner class for taking array as input 

        for example:
         Scanner sc = new Scanner(System.in);
         int arr = new int [10];

         for particular element :
            arr[0]=sc.nextInt();
        for whole array:
            for(int i=0;i<=10;i++){
                arr[i]=sc.nextInt();
            }
        #for printing the array :
            for(int i=0;i<=10;i++){
                System.out.Println(arr[i]);
            }

    
    Arrays in Function :

        How we can pass an array to a function
            Example:
            //passing an array to function FunName.
            FunName(ArrayName);
            
            //Reciving an array in a function that is FunName.
             public static ReturnType FunName(dataType [] ArrayName){

             }

        How we recive an array from a function:
             Example:
             //Returning an array from a function FunName.
             public static dataType [] ArrayNmae FunName(){
                 

                return ArrayName;
             }


  
  
 */