String word = "hello world";
        String data[];int k=0;
        data=word.split("");
        for(int i=0;i<data.length;i++){
            if(data[i].equals(" ")){
                k++;
            }
 
        }
        System.out.println(k);	// your code goes here
