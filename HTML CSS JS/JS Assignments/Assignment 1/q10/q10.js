function fib(n){
    let f = new Array(n+2);
    let i;
    f[0]=1;
    console.log(f[0]);
    document.write(f[0]);
    f[1]=1;
    console.log(f[1]);
    document.write(f[1]);
    for(i=2; i<=n; i++){
        f[i]=f[i-1]+f[i-2];
        console.log(f[i]);
    document.write(f[i]+"\n");
    }
}

let n=100;
document.write(fib(n));