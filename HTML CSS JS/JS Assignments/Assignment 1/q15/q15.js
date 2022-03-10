//Bobble Sort
function bobbleSort(arr){
    
    for(var i = 0; i<arr.length; i++){
        
        for(var j = 0; j<(arr.length -i -1); j++){

            if(arr[j] > arr[j+1]){

                var temp = arr[j];
                arr[j] =arr[j+1];
                arr[j+1] = temp;

            }
        }
    }
    console.log(arr);
    document.write(arr);
}

var arr = [234,12,342,35,567,87,985,1,43,589,76];
console.log(arr);
bobbleSort(arr);

//Merge Soert

const mergeArrays = (a, b) => {
    const c = []

    while (a.length && b.length) {
        c.push(a[0] > b[0] ? b.shift() : a.shift())
    }

    //if we still have values, let's add them at the end of `c`
    while (a.length) {
        c.push(a.shift())
    }
    while (b.length) {
        c.push(b.shift())
    }
    console.log(c);
    document.write("\n"+c);
}

const mergeSort = (a) => {
    if (a.length < 2) return a
    const middle = Math.floor(a.length / 2)
    const a_l = a.slice(0, middle)
    const a_r = a.slice(middle, a.length)
    const sorted_l = mergeSort(a_l)
    const sorted_r = mergeSort(a_r)
    return mergeArrays(sorted_l, sorted_r)
}

var arr = [234,12,342,35,567,87,985,1,43,589,76];

mergeSort(arr);