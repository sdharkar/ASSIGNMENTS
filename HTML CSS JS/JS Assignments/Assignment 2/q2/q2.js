var square=(x)=>{
    return x*x;
}

var double=(x)=>{
    return x*2;
}

var compose = function compose(f1,f2){
    return function (value){
        return f1(f2(value));
    };
};

var f1 = compose(square, double);
var f2 = compose(double, square);

console.log(f1(5));
console.log(f1(10));
console.log(f2(5));
console.log(f2(10));