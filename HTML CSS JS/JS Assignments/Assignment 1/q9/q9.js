var list1 = ["a","b","c"];
var list2 = [1,2,3];

new array = [];

var arr_length = list1.length+list2.length;

let j=0,k=0;
    for (var i = 0; i < arr_length; i++) {
    if(i%2 == 0) {
        array[i] = list1[k++]
    }else{
        array[i] = list2[j++]
    }
}
console.log(array) 