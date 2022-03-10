let year=prompt("Enter:");
let n=year+20;
for(year;year<=n;year++){
    if(year%4==0 && year%100==0){
        document.write(year+"its leap year");
    }
    
}
console.log(year);