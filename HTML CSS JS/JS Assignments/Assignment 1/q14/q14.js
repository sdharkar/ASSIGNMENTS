// Array.from({length: 100}, () => Math.floor(Math.random() * 100));
// document.write(Array);

for (var a=[],i=1;i<=100;++i) a[i]=i;

function shuffle(array) {
    var tmp, current, top = array.length;
    if(top) while(--top) {
    current = Math.floor(Math.random() * (top + 1));
    tmp = array[current];
    array[current] = array[top];
    array[top] = tmp;
    }
    return array;
}

a = shuffle(a);

//Print the largest number amongst the 100 
function largestNo(arr){
    largest =0;
    for(var i = 0; i<=largest; i++){
        if(arr[i]>largest){
            var largest=arr[i];
        }
    }
    console.log(largest);
    document.write("\nLargest Number : "+largest);
}

largestNo(a);

//Print the smallest number amongst the 100 
// function smallestNo(arr){
//     smallest =100;
//     for(var i = 100; i<=smallest; i--){
//         if(arr[i]>smallest){
//             var smallest=arr[i];
//         }
//     }
//     console.log(smallest);
//     document.write("\nSmallest Number : "+smallest);
// }

// smallestNo(a);

// const min = Math.min(a)
// console.log(min);
// document.write("\nSmallest Number : "+ min);

function SmallestBobbleSort(arr){
    
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
    document.write("\nSmallest Number:"+arr[0]);
}

SmallestBobbleSort(a);

//Print which count is high even count or odd count 
function oddEven(arr){
    var odd = 0;
    var even = 0;
    for(var i=1; i<arr.length;i++){
        if(arr[i]%2==0){
            even++;
        }
        else{
            odd++;
        }
    }
    console.log(even+"\n"+odd);
    document.write("\nEven Count:"+even+"\nOdd Count:"+odd);
}

oddEven(a);

//Print the sum and average value
function sumAvg(arr){
    var sum=0, avg;
    for(var i =0; i<arr.length; i++){
        sum+=i;
    }
    console.log(sum);
    document.write("\n SUM :"+sum);
    var avg = (sum/arr.length);
    console.log(avg);
    document.write("\n AVG :"+avg);
}

sumAvg(a);