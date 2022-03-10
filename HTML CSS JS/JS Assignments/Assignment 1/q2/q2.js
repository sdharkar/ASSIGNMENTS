function numberSum(n){
    var total =0;
    for(var i=1; i<=n;i++){
        if(i%3==0 || i%5==0){
            total+=i;
        }
        else{
            continue;
        }
        
    }
    document.write(total);
}

numberSum(17);