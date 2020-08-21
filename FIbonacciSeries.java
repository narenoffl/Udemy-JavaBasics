function fibonacciGenerator (n) {
//Do NOT change any of the code above 👆
    
    //Write your code here:
    
   var output = [];
   var j =1;
   if(n==1){
       output = [0];
   }
   else if(n==2){
       output = [0,1];
   }
   else{
       output = [0,1];
       for(var i = 0; i<n-2; i++){
           output.push(output[i] + output[j]);
           j++;
       }
   }
   console.log(output);
    
    
    
    
    
    
    //Return an array of fibonacci numbers starting from 0.
    
//Do NOT change any of the code below 👇
}

