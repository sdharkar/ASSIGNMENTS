const rotateK = function(arr, k) {

    for (let i = 0; i < k; i++) {
        arr.unshift(arr.pop());
    }
    console.log(arr);
    document.write(arr);
}

var a = [1,2,3,4,5,6,7,8];
rotateK(a,2);