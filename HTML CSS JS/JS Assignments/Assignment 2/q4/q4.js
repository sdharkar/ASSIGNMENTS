function square(value){
    return value*value;
}
function test(arr,func){
    var arr2=[];
    for (var i = 0; i < arr.length; i++) {
        arr2.push(func(arr[i]));
    }
    return arr2;
}

const map = (arr,fun)=>test(arr,fun);
console.log(map([1, 2, 3, 4, 5], square));
console.log(map([1, 4, 9, 16, 25], Math.sqrt));